package com.ural_nigmatullin.skssapplication.di;

import com.ural_nigmatullin.skssapplication.domain.NewsListInteractor;
import com.ural_nigmatullin.skssapplication.domain.NewsListInteractorInterface;
import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;

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
    NewsListInteractorInterface provideNewsListInteractor(NewsRepositoryInterface newsRepository) {
        return new NewsListInteractor(newsRepository);
    }
}
