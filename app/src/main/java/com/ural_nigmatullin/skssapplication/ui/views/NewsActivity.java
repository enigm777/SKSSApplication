package com.ural_nigmatullin.skssapplication.ui.views;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ural_nigmatullin.skssapplication.R;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        NewsListFragment newsListFragment = new NewsListFragment();
        fragmentTransaction.add(R.id.fragment_container, newsListFragment).commit();
    }
}
