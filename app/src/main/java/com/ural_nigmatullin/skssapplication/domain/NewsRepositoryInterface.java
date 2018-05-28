package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерфейс репозитория новостей с главной страницы сайта
 * <p>
 * Created by enigm on 31/03/2018.
 */

public interface NewsRepositoryInterface {

    /**
     * Вернуть список новостей
     *
     * @return список новостей
     */
    Single<List<NewsItem>> getNews();
}
