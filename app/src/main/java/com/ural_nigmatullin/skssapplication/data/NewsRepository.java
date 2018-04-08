package com.ural_nigmatullin.skssapplication.data;

import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;

import java.util.List;

/**
 * Created by enigm on 08/04/2018.
 */

public class NewsRepository implements NewsRepositoryInterface {

    private List<NewsItem> mNewsList;



    @Override
    public List<NewsItem> getNews() {
        return null;
    }
}
