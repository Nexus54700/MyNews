package com.exozz.mynews.Controllers.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopStories {

    @SerializedName("item_type")
    @Expose
    private String itemType;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("caption")
    @Expose
    private String caption;


    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.itemType = caption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


}
