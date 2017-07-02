package com.example.xxl.rxjavaretrofitdemo;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by xxl on 17-7-2.
 */

public interface MovieService {
    @GET("top250")
    Observable<MovieEntity> getMovie(@Query("start") int start, @Query("count") int count);
}
