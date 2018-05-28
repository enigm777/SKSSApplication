package com.ural_nigmatullin.skssapplication.data;

import com.ural_nigmatullin.skssapplication.data.network.SkssApi;
import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;

import java.util.List;

import io.reactivex.Single;

/**
 * Реализация репозитория новостей для главной
 *
 * Created by enigm on 08/04/2018.
 */
public class NewsRepository implements NewsRepositoryInterface {

    /**
     * Интерфейс сервиса подгрузки данных из сети (ретрофит)
     */
    private SkssApi mSkssApi;

    public NewsRepository(SkssApi skssApi) {
        mSkssApi = skssApi;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<NewsItem>> getNews() {
        return mSkssApi.getNewsList()
                .flatMapIterable(newsItemModels -> newsItemModels)
                .map(newsItemModel -> new NewsItem(newsItemModel.getTitle(), null, newsItemModel.getContent()))
                .toList();
    }
}
