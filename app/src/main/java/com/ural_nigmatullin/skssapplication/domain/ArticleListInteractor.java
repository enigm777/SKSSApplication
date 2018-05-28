package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.ArticleItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерактор получения списка новостей на главной
 * <p>
 * Created by enigm on 31/03/2018.
 */
public class ArticleListInteractor implements ArticleListInteractorInterface {

    /**
     * Репозиторий новостей
     */
    private ArticleRepositoryInterface mNewsRepository;

    public ArticleListInteractor(ArticleRepositoryInterface newsRepository) {
        mNewsRepository = newsRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getNewsList() {
        return mNewsRepository.getNews();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getAboutList() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getAbiturientList() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getStudentList() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getVospitList() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getUmrList() {
        return null;
    }
}
