package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

/**
 * Интерактор для получения списка новостей с сайта
 * Created by enigm on 31/03/2018.
 */

public interface NewsListInteractorInterface {

    /**
     * Получить список новостей с сайта
     * @return список новостей
     */
    List<NewsItem> getNewsList();
}
