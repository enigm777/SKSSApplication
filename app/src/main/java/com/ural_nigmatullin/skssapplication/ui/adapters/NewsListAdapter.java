package com.ural_nigmatullin.skssapplication.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ural_nigmatullin.skssapplication.R;
import com.ural_nigmatullin.skssapplication.data.ArticleItem;

import java.util.List;

/**
 * Адаптер списка новостей на главной
 * <p>
 * Created by enigm on 02/04/2018.
 */
public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsListItemViewHolder> {

    /**
     * Список новостей
     */
    private List<ArticleItem> mNewsItemList;

    public NewsListAdapter(List<ArticleItem> newsItemList) {
        mNewsItemList = newsItemList;
    }

    @Override
    public NewsListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.news_list_item, parent, false);
        return new NewsListItemViewHolder(view);
    }

    /**
     * Вызывается при привязке холдера к позиции в списке
     *
     * @param holder   контейнер новости
     * @param position номер позиции в списке
     */
    @Override
    public void onBindViewHolder(NewsListItemViewHolder holder, int position) {
        holder.mNewsItemTitleTextView.setText(mNewsItemList.get(position).getArticleItemTitle());
        holder.mNewsItemContentTextView.setText(mNewsItemList.get(position).getArticleItemContent());
    }

    /**
     * Обновить список новостей в адаптере
     *
     * @param newsItemList
     */
    public void setNewsItemList(List<ArticleItem> newsItemList) {
        mNewsItemList = newsItemList;
        notifyDataSetChanged();
    }

    /**
     * Возвращает количество элементов в списке
     * нужно чтобы понять сколько холдеров понадобится адаптеру
     *
     * @return количество элементов в списке
     */
    @Override
    public int getItemCount() {
        return mNewsItemList.size();
    }

    /**
     * ViewHolder новости на главной
     */
    static class NewsListItemViewHolder extends RecyclerView.ViewHolder {

        /**
         * Заголовок новости
         */
        final TextView mNewsItemTitleTextView;
        /**
         * КДПВ новости
         */
        final ImageView mNewsItemImageView;
        /**
         * Текст новости
         */
        final TextView mNewsItemContentTextView;

        public NewsListItemViewHolder(View view) {
            super(view);

            mNewsItemTitleTextView = view.findViewById(R.id.news_item_title_text_view);
            mNewsItemImageView = view.findViewById(R.id.news_item_image_image_view);
            mNewsItemContentTextView = view.findViewById(R.id.news_item_content_text_view);
        }

    }
}
