package com.exozz.mynews.Controllers.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.exozz.mynews.Controllers.Models.TopStories;
import com.exozz.mynews.R;

import java.util.List;

public class TopStoriesAdapter extends RecyclerView.Adapter<TopStoriesViewHolder> {

    // FOR DATA
    private List<TopStories> topStories;

    // CONSTRUCTOR
    public TopStoriesAdapter(List<TopStories> topStories) {
        this.topStories = topStories;
    }

    @Override
    public TopStoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // CREATE VIEW HOLDER AND INFLATING ITS XML LAYOUT
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cell_article, parent, false);

        return new TopStoriesViewHolder(view);
    }

    // UPDATE VIEW HOLDER WITH A TOPSTORIES
    @Override
    public void onBindViewHolder(TopStoriesViewHolder viewHolder, int position) {
        viewHolder.updateWithTopStories(this.topStories.get(position));
    }

    // RETURN THE TOTAL COUNT OF ITEMS IN THE LIST
    @Override
    public int getItemCount() {
        return this.topStories.size();
    }
}