package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.ArticleItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерфейс репозитория новостей с главной страницы сайта
 * <p>
 * Created by enigm on 31/03/2018.
 */

public interface ArticleRepositoryInterface {

    /**
     * Вернуть список новостей
     *
     * @return список новостей
     */
    Single<List<ArticleItem>> getNews();

    /**
     * Получить список статей для меню "О колледже"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getAboutArticleList();

    /**
     * Получить список статей для меню "Абитуриенту"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getAbiturientArticleList();

    /**
     * Получить список статей для меню "Студенту"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getStudentArticleList();

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getVospitArticleList();

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getUmrArticleList();
}
