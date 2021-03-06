package com.ural_nigmatullin.skssapplication.data;

import com.ural_nigmatullin.skssapplication.data.network.SkssApi;
import com.ural_nigmatullin.skssapplication.domain.ArticleRepositoryInterface;

import java.util.List;

import io.reactivex.Single;

/**
 * Реализация репозитория новостей для главной
 *
 * Created by enigm on 08/04/2018.
 */
public class ArticleRepository implements ArticleRepositoryInterface {

    /**
     * Интерфейс сервиса подгрузки данных из сети (ретрофит)
     */
    private SkssApi mSkssApi;

    public ArticleRepository(SkssApi skssApi) {
        mSkssApi = skssApi;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getNews() {
        return mSkssApi.getNewsList()
                .flatMapIterable(newsItemModels -> {
                    return newsItemModels;
                })
                .map(newsItemModel -> new ArticleItem(newsItemModel.getTitle(), null, newsItemModel.getContent()))
                .toList();
    }

    /**
     * Получить список статей для меню "О колледже"
     *
     * @return список статей
     */
    @Override
    public Single<List<ArticleItem>> getAboutArticleList() {
        return mSkssApi.getAboutList()
                .flatMapIterable(itemModels -> {
                    return itemModels;
                })
                .map(itemModel -> new ArticleItem(itemModel.getTitle(), null, itemModel.getContent()))
                .toList();
    }

    /**
     * Получить список статей для меню "Абитуриенту"
     *
     * @return список статей
     */
    @Override
    public Single<List<ArticleItem>> getAbiturientArticleList() {
        return mSkssApi.getAbiturientList()
                .flatMapIterable(itemModels -> {
                    return itemModels;
                })
                .map(itemModel -> new ArticleItem(itemModel.getTitle(), null, itemModel.getContent()))
                .toList();
    }

    /**
     * Получить список статей для меню "Студенту"
     *
     * @return список статей
     */
    @Override
    public Single<List<ArticleItem>> getStudentArticleList() {
        return mSkssApi.getStudentList()
                .flatMapIterable(itemModels -> {
                    return itemModels;
                })
                .map(itemModel -> new ArticleItem(itemModel.getTitle(), null, itemModel.getContent()))
                .toList();
    }

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    @Override
    public Single<List<ArticleItem>> getVospitArticleList() {
        return mSkssApi.getVospitList()
                .flatMapIterable(itemModels -> {
                    return itemModels;
                })
                .map(itemModel -> new ArticleItem(itemModel.getTitle(), null, itemModel.getContent()))
                .toList();
    }

    /**
     * Получить список статей для меню "Воспитательная работа"
     *
     * @return список статей
     */
    @Override
    public Single<List<ArticleItem>> getUmrArticleList() {
        return mSkssApi.getUmrList()
                .flatMapIterable(itemModels -> {
                    return itemModels;
                })
                .map(itemModel -> new ArticleItem(itemModel.getTitle(), null, itemModel.getContent()))
                .toList();
    }
}
