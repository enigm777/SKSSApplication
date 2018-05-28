package com.ural_nigmatullin.skssapplication.ui.views;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.ural_nigmatullin.skssapplication.R;
import com.ural_nigmatullin.skssapplication.ui.presenters.SplashScreenPresenter;

public class SplashScreenActivity extends MvpAppCompatActivity implements ISplashScreenView {

    @InjectPresenter
    SplashScreenPresenter mSplashScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mSplashScreenPresenter.stopLoading();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopShowLoading() {
        SystemClock.sleep(2000);
        Intent intent = new Intent(this, NewsListActivity.class);
        startActivity(intent);
    }
}
