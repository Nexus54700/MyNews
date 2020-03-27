package com.exozz.mynews.Controllers.views;


import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.module.AppGlideModule;
import com.exozz.mynews.Controllers.Models.Multimedia;
import com.exozz.mynews.Controllers.Models.Result;
import com.exozz.mynews.Controllers.Models.TopStories;
import com.exozz.mynews.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopStoriesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.imageArticle)
    ImageView imageView ;

    @BindView(R.id.localisationSujetArticle)
    TextView localisationArticle;

    @BindView(R.id.publicationDate)
    TextView publicationDate;

    @BindView(R.id.descriptionArticle)
    TextView descriptionArticle;



    public TopStoriesViewHolder(View itemView)  {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }


    public void updateWithTopStories(TopStories topStories) {



        Glide.with(itemView.getContext()).load(topStories.getUrl()).error(R.drawable.erreur).into(imageView);
        publicationDate.setText(topStories.getCreatedDate());
        descriptionArticle.setText(topStories.getTitle());
        localisationArticle.setText(topStories.getSubsection());
    }
}
