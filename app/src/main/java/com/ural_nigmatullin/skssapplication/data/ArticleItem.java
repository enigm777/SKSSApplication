package com.ural_nigmatullin.skssapplication.data;

/**
 * Элемент списка статей
 *
 * Created by enigm on 31/03/2018.
 */
public class ArticleItem {

    // Заголовок новости
    String mArticleItemTitle;

    // Ссылка на КДПВ новости
    String mArticleItemImageUrl;

    // Собственно сам текст новости
    String mArticleItemContent;

    public ArticleItem(String articleItemTitle, String articleItemImageUrl, String newsItemContent) {
        mArticleItemTitle = articleItemTitle;
        mArticleItemImageUrl = articleItemImageUrl;
        mArticleItemContent = newsItemContent;
    }

    public String getArticleItemTitle() {
        return mArticleItemTitle;
    }

    public void setArticleItemTitle(String articleItemTitle) {
        mArticleItemTitle = articleItemTitle;
    }

    public String getArticleItemImageUrl() {
        return mArticleItemImageUrl;
    }

    public void setArticleItemImageUrl(String articleItemImageUrl) {
        mArticleItemImageUrl = articleItemImageUrl;
    }

    public String getArticleItemContent() {
        return mArticleItemContent;
    }

    public void setArticleItemContent(String articleItemContent) {
        mArticleItemContent = articleItemContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleItem articleItem = (ArticleItem) o;

        if (mArticleItemTitle != null ? !mArticleItemTitle.equals(articleItem.mArticleItemTitle) : articleItem.mArticleItemTitle != null)
            return false;
        if (mArticleItemImageUrl != null ? !mArticleItemImageUrl.equals(articleItem.mArticleItemImageUrl) : articleItem.mArticleItemImageUrl != null)
            return false;
        return mArticleItemContent != null ? mArticleItemContent.equals(articleItem.mArticleItemContent) : articleItem.mArticleItemContent == null;
    }

    @Override
    public int hashCode() {
        int result = mArticleItemTitle != null ? mArticleItemTitle.hashCode() : 0;
        result = 31 * result + (mArticleItemImageUrl != null ? mArticleItemImageUrl.hashCode() : 0);
        result = 31 * result + (mArticleItemContent != null ? mArticleItemContent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ArticleItem{" +
                "mArticleItemTitle='" + mArticleItemTitle + '\'' +
                ", mArticleItemImageUrl='" + mArticleItemImageUrl + '\'' +
                ", mArticleItemContent='" + mArticleItemContent + '\'' +
                '}';
    }
}