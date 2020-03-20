package com.exozz.mynews.Controllers.utils;

import com.exozz.mynews.Controllers.Models.TopStories;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class TopStoriesStreams {

    public static Observable<List<TopStories>> streamFetchUserFollowing(String section){
        TheNewYorkTimesService theNewYorkTimesService = TheNewYorkTimesService.retrofit.create(TheNewYorkTimesService.class);
        return TheNewYorkTimesService.getFollowing(section)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }
}