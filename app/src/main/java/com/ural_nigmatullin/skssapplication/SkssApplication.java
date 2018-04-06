package com.ural_nigmatullin.skssapplication;

import android.app.Application;

import com.ural_nigmatullin.skssapplication.di.ApplicationComponent;
import com.ural_nigmatullin.skssapplication.di.DaggerApplicationComponent;
import com.ural_nigmatullin.skssapplication.di.DataModule;
import com.ural_nigmatullin.skssapplication.di.DomainModule;

/**
 * @author Урал Нигматуллин
 */

public class SkssApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .dataModule(new DataModule())
                .domainModule(new DomainModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent(){
        return mApplicationComponent;
    }
}
