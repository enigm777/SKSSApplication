package com.ural_nigmatullin.skssapplication.data.network;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Интерфейс сервиса запросов в сеть (ретрофит)
 * <p>
 * Created by enigm on 08/04/2018.
 */
public interface SkssApi {

    /**
     * Получить список новостей на главную
     *
     * @return список статей для главной
     */
    @GET("news/list")
    Observable<List<ItemModel>> getNewsList();

    /**
     * Получить список статей для меню "О колледже"
     *
     * @return список статей
     */
    @GET("about/list")
    Observable<List<ItemModel>> getAboutList();

    /**
     * Получить список статей для меню "Абитуриенту"
     *
     * @return список статей
     */
    @GET("abiturient/list")
    Observable<List<ItemModel>> getAbiturientList();

    /**
     * Получить список статей для меню "Студенту"
     *
     * @return список статей
     */
    @GET("student/list")
    Observable<List<ItemModel>> getStudentList();

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    @GET("vospit/list")
    Observable<List<ItemModel>> getVospitList();

    /**
     * Получить список статей для меню "Учебно-методическая работа"
     *
     * @return список статей
     */
    @GET("umr/list")
    Observable<List<ItemModel>> getUmrList();

}
