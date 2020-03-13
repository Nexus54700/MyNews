package com.exozz.mynews.Controllers.utils;

import androidx.annotation.Nullable;

import com.exozz.mynews.Controllers.Models.TopStories;

import java.lang.ref.WeakReference;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TheNewYorkTimesCalls {

    // 1 - Creating a callback
    public interface Callbacks {
        void onResponse(@Nullable List<TopStories> users);
        void onFailure();
    }

    // 2 - Public method to start fetching users following by Jake Wharton
    public static void fetchUserFollowing(Callbacks callbacks, String section){

        // 2.1 - Create a weak reference to callback (avoid memory leaks)
        final WeakReference<Callbacks> callbacksWeakReference = new WeakReference<Callbacks>(callbacks);

        // 2.2 - Get a Retrofit instance and the related endpoints
        TheNewYorkTimesService theNewYorkTimesService = TheNewYorkTimesService.retrofit.create(TheNewYorkTimesService.class);

        // 2.3 - Create the call on Github API
        Call<List<TopStories>> call = TheNewYorkTimesService.getFollowing(section);
        // 2.4 - Start the call
        if (call != null) {
            call.enqueue(new Callback<List<TopStories>>() {

                @Override
                public void onResponse(Call<List<TopStories>> call, Response<List<TopStories>> response) {
                    // 2.5 - Call the proper callback used in controller (MainFragment)
                    if (callbacksWeakReference.get() != null) callbacksWeakReference.get().onResponse(response.body());
                }

                @Override
                public void onFailure(Call<List<TopStories>> call, Throwable t) {
                    // 2.5 - Call the proper callback used in controller (MainFragment)
                    if (callbacksWeakReference.get() != null) callbacksWeakReference.get().onFailure();
                }
            });
        }
    }
}
