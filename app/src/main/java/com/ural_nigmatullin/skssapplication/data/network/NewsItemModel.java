package com.ural_nigmatullin.skssapplication.data.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by enigm on 08/04/2018.
 */

public class NewsItemModel {

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("content")
    @Expose
    private String mContent;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsItemModel that = (NewsItemModel) o;

        if (mTitle != null ? !mTitle.equals(that.mTitle) : that.mTitle != null) return false;
        return mContent != null ? mContent.equals(that.mContent) : that.mContent == null;
    }

    @Override
    public int hashCode() {
        int result = mTitle != null ? mTitle.hashCode() : 0;
        result = 31 * result + (mContent != null ? mContent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NewsItemModel{" +
                "mTitle='" + mTitle + '\'' +
                ", mContent='" + mContent + '\'' +
                '}';
    }
}
