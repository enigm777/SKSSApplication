package com.ural_nigmatullin.skssapplication.data;

/**
 * Элемент списка новостей
 * Created by enigm on 31/03/2018.
 */
public class NewsItem {

    // Заголовок новости
    String mNewsItemTitle;

    // Ссылка на КДПВ новости
    String mNewsItemImageUrl;

    // Собственно сам текст новости
    String mNewsItemContent;

    public NewsItem(String newsItemTitle, String newsItemImageUrl, String newsItemContent) {
        mNewsItemTitle = newsItemTitle;
        mNewsItemImageUrl = newsItemImageUrl;
        mNewsItemContent = newsItemContent;
    }

    public String getNewsItemTitle() {
        return mNewsItemTitle;
    }

    public void setNewsItemTitle(String newsItemTitle) {
        mNewsItemTitle = newsItemTitle;
    }

    public String getNewsItemImageUrl() {
        return mNewsItemImageUrl;
    }

    public void setNewsItemImageUrl(String newsItemImageUrl) {
        mNewsItemImageUrl = newsItemImageUrl;
    }

    public String getNewsItemContent() {
        return mNewsItemContent;
    }

    public void setNewsItemContent(String newsItemContent) {
        mNewsItemContent = newsItemContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsItem newsItem = (NewsItem) o;

        if (mNewsItemTitle != null ? !mNewsItemTitle.equals(newsItem.mNewsItemTitle) : newsItem.mNewsItemTitle != null)
            return false;
        if (mNewsItemImageUrl != null ? !mNewsItemImageUrl.equals(newsItem.mNewsItemImageUrl) : newsItem.mNewsItemImageUrl != null)
            return false;
        return mNewsItemContent != null ? mNewsItemContent.equals(newsItem.mNewsItemContent) : newsItem.mNewsItemContent == null;
    }

    @Override
    public int hashCode() {
        int result = mNewsItemTitle != null ? mNewsItemTitle.hashCode() : 0;
        result = 31 * result + (mNewsItemImageUrl != null ? mNewsItemImageUrl.hashCode() : 0);
        result = 31 * result + (mNewsItemContent != null ? mNewsItemContent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "mNewsItemTitle='" + mNewsItemTitle + '\'' +
                ", mNewsItemImageUrl='" + mNewsItemImageUrl + '\'' +
                ", mNewsItemContent='" + mNewsItemContent + '\'' +
                '}';
    }
}