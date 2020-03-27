package com.exozz.mynews.Controllers.utils;

import com.exozz.mynews.Controllers.Models.Result;
import com.exozz.mynews.Controllers.Models.TopStories;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TheNewYorkTimesService {
    @GET("{section}.json?api-key=o6yIHhGmWFATwt9lma0sLPYGVC2LHzrG")
     Observable<Result> getFollowing(@Path("section") String section);

     Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/topstories/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();
}


