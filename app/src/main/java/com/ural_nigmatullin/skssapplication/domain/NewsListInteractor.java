package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

/**
 * Created by enigm on 31/03/2018.
 */

public class NewsListInteractor implements NewsListInteractorInterface {

    private NewsRepositoryInterface mNewsRepository;

    public NewsListInteractor(NewsRepositoryInterface newsRepository){
        mNewsRepository = newsRepository;
    }

    @Override
    public List<NewsItem> getNewsList() {
        return mNewsRepository.getNews();
    }
}
