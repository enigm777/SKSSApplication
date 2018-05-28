package com.ural_nigmatullin.skssapplication.domain;

import com.ural_nigmatullin.skssapplication.data.ArticleItem;

import java.util.List;

import io.reactivex.Single;

/**
 * Интерактор получения статей
 * <p>
 * Created by enigm on 31/03/2018.
 */
public class ArticleListInteractor implements ArticleListInteractorInterface {

    /**
     * Репозиторий новостей
     */
    private ArticleRepositoryInterface mArticleRepository;

    public ArticleListInteractor(ArticleRepositoryInterface articleRepository) {
        mArticleRepository = articleRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getNewsList() {
        return mArticleRepository.getNews();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getAboutList() {
        return mArticleRepository.getAboutArticleList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getAbiturientList() {
        return mArticleRepository.getAbiturientArticleList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getStudentList() {
        return mArticleRepository.getStudentArticleList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getVospitList() {
        return mArticleRepository.getVospitArticleList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Single<List<ArticleItem>> getUmrList() {
        return mArticleRepository.getUmrArticleList();
    }
}
