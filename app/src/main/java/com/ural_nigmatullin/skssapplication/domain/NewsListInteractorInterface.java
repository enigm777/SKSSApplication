package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерактор для получения списка новостей с сайта
 * Created by enigm on 31/03/2018.
 */

public interface NewsListInteractorInterface {

    /**
     * Получить список новостей с сайта
     * @return список новостей
     */
    Single<List<NewsItem>> getNewsList();
}
