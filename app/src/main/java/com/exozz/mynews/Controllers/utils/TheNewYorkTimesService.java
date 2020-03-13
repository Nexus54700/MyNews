package com.exozz.mynews.Controllers.utils;

import com.exozz.mynews.Controllers.Models.TopStories;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TheNewYorkTimesService {
    @GET("/{section}.json?api-key=o6yIHhGmWFATwt9lma0sLPYGVC2LHzrG")
    static Call<List<TopStories>> getFollowing(@Path("section") String section) {
        return null;
    }

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/topstories/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}


