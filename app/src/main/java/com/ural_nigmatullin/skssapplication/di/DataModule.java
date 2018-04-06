package com.ural_nigmatullin.skssapplication.di;

import com.ural_nigmatullin.skssapplication.data.FakeNewsRepository;
import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Урал Нигматуллин
 */

@Module
public class DataModule {

    /**
     * Предоставить репозиторий новостей
     *
     * @return
     */
    @Singleton
    @Provides
    NewsRepositoryInterface provideNewsRepository() {
        return new FakeNewsRepository();
    }

}
