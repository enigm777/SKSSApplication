package com.ural_nigmatullin.skssapplication.di;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.ural_nigmatullin.skssapplication.data.FakeNewsRepository;
import com.ural_nigmatullin.skssapplication.data.NewsRepository;
import com.ural_nigmatullin.skssapplication.data.network.SkssApi;
import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Модуль для разрешения зависимостей слоя данных
 *
 * @author Урал Нигматуллин
 */
@Module
public class DataModule {

    private static final String SKSS_API_BASE_URL = "http://enigm.ru:32322/ru.enigm.skss.server-1.0-SNAPSHOT/";

    /**
     * Provide news repository
     *
     * @return news repository
     */
    @Singleton
    @Provides
    NewsRepositoryInterface provideNewsRepository(SkssApi skssApi) {
        return new NewsRepository(skssApi);
    }

    /**
     * Provide retrofit component
     *
     * @return retrofit
     */
    @Singleton
    @Provides
    Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(SKSS_API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    /**
     * Provide service api
     *
     * @param retrofit
     * @return skssApi
     */
    @Singleton
    @Provides
    SkssApi provideSkssApi(Retrofit retrofit) {
        return retrofit.create(SkssApi.class);
    }

}
