package com.ural_nigmatullin.skssapplication.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ural_nigmatullin.skssapplication.R;
import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

/**
 * Created by enigm on 02/04/2018.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsListItemViewHolder> {


    private List<NewsItem> mNewsItemList;

    public NewsListAdapter(List<NewsItem> newsItemList) {
        mNewsItemList = newsItemList;
    }

    @Override
    public NewsListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.news_list_item, parent, false);
        return new NewsListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsListItemViewHolder holder, int position) {
        holder.mNewsItemTitleTextView.setText(mNewsItemList.get(position).getNewsItemTitle());
        holder.mNewsItemContentTextView.setText(mNewsItemList.get(position).getNewsItemContent());
    }

    /**
     * Обновить список новостей в адаптере
     *
     * @param newsItemList
     */
    public void setNewsItemList(List<NewsItem> newsItemList) {
        mNewsItemList = newsItemList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mNewsItemList.size();
    }

    static class NewsListItemViewHolder extends RecyclerView.ViewHolder {

        final TextView mNewsItemTitleTextView;
        final ImageView mNewsItemImageView;
        final TextView mNewsItemContentTextView;

        public NewsListItemViewHolder(View view) {
            super(view);

            mNewsItemTitleTextView = view.findViewById(R.id.news_item_title_text_view);
            mNewsItemImageView = view.findViewById(R.id.news_item_image_image_view);
            mNewsItemContentTextView = view.findViewById(R.id.news_item_content_text_view);
        }

    }
}
