package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.NewsItem;

import java.util.List;

/**
 * Интерфейс репозитория новостей с главной страницы сайта
 *
 * Created by enigm on 31/03/2018.
 */

public interface NewsRepositoryInterface {

    List<NewsItem> getNews();
}
