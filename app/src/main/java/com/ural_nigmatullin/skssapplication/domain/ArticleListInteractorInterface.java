package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.ArticleItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерактор для получения статей
 * <p>
 * Created by enigm on 31/03/2018.
 */
public interface ArticleListInteractorInterface {

    /**
     * Получить список новостей с сайта
     *
     * @return список новостей
     */
    Single<List<ArticleItem>> getNewsList();

    /**
     * Получить список статей для меню "О колледже"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getAboutList();

    /**
     * Получить список статей для меню "Абитуриенту"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getAbiturientList();

    /**
     * Получить список статей для меню "Студенту"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getStudentList();

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getVospitList();

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    Single<List<ArticleItem>> getUmrList();
}
