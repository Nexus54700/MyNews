package com.exozz.mynews.Controllers.views;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.exozz.mynews.Controllers.Models.TopStories;

import butterknife.ButterKnife;

public class TopStoriesViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public TopStoriesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void updateWithTopStories(TopStories topStories){
        this.textView.setText(topStories.getUrl());
    }
}
