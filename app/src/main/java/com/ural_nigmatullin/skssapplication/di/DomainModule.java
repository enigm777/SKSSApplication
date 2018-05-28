package com.ural_nigmatullin.skssapplication.di;

import com.ural_nigmatullin.skssapplication.domain.ArticleListInteractor;
import com.ural_nigmatullin.skssapplication.domain.ArticleListInteractorInterface;
import com.ural_nigmatullin.skssapplication.domain.ArticleRepositoryInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Модуль для разрешения зависимостей слоя бизнес логики
 *
 * @author Урал Нигматуллин
 */
@Module
public class DomainModule {

    /**
     * Предоставить интерактор получения списка новостей
     *
     * @param newsRepository
     * @return
     */
    @Singleton
    @Provides
    ArticleListInteractorInterface provideNewsListInteractor(ArticleRepositoryInterface newsRepository) {
        return new ArticleListInteractor(newsRepository);
    }
}
