package com.ural_nigmatullin.skssapplication.ui.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.ural_nigmatullin.skssapplication.ui.views.ISplashScreenView;

/**
 * Презентер стартового экрана (например, для подгрузки каких-то данных в фоне)
 *
 * Created by enigm on 11/04/2018.
 */
@InjectViewState
public class SplashScreenPresenter extends MvpPresenter<ISplashScreenView> {

    public SplashScreenPresenter(){
    }

    public void stopLoading(){
        getViewState().stopShowLoading();
    }
}
