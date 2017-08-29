package com.example.usiek.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.usiek.movieapp.component.DaggerServiceComponent;
import com.example.usiek.movieapp.component.ServiceComponent;
import com.example.usiek.movieapp.model.Movie;
import com.example.usiek.movieapp.module.ServiceModule;
import com.example.usiek.movieapp.service.MovieService;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    String url = "http://www.json-generator.com/api/json/";

    private MovieService.MovieApi movieApi;
    ServiceComponent serviceComponent;
    private List<Movie> reposMovie = new ArrayList<>();

    @Inject
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        injecServiceComponent();

    }

    private void injecServiceComponent() {
        serviceComponent = DaggerServiceComponent.builder()
                .serviceModule(new ServiceModule(url))
                .build();
        serviceComponent.inject(this);
        movieApi = retrofit.create(MovieService.MovieApi.class);
    }

    public void fetchMovie(final int indent) {
        movieApi.getMovie(indent)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Movie>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<Movie> movies) {
                        reposMovie.addAll(movies);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @OnClick(R.id.movieDownload)
    public void dovnloadMovie() {
        fetchMovie(2);
    }
}
