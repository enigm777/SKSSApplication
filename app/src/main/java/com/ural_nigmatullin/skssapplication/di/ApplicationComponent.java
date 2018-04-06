package com.ural_nigmatullin.skssapplication.di;

import com.ural_nigmatullin.skssapplication.ui.views.NewsListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Урал Нигматуллин
 */

@Singleton
@Component(modules = {DataModule.class, DomainModule.class})
public interface ApplicationComponent {

    void inject(NewsListFragment newsListFragment);
}
