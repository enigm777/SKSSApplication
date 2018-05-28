package com.ural_nigmatullin.skssapplication.ui.views;

import com.arellomobile.mvp.MvpView;

/**
 * Created by enigm on 11/04/2018.
 */
public interface ILoadingView extends MvpView{

    /**
     * Отобразить загрузку на экране
     */
    void showLoading();

    /**
     * Прекратить отображение загрузки на экране
     */
    void stopShowLoading();
}
