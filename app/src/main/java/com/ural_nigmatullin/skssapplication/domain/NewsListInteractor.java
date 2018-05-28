package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерактор получения списка новостей на главной
 * <p>
 * Created by enigm on 31/03/2018.
 */
public class NewsListInteractor implements NewsListInteractorInterface {

    /**
     * Репозиторий новостей
     */
    private NewsRepositoryInterface mNewsRepository;

    public NewsListInteractor(NewsRepositoryInterface newsRepository) {
        mNewsRepository = newsRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<NewsItem>> getNewsList() {
        return mNewsRepository.getNews();
    }
}
