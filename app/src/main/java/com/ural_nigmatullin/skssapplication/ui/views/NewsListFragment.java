package com.ural_nigmatullin.skssapplication.ui.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ural_nigmatullin.skssapplication.R;
import com.ural_nigmatullin.skssapplication.SkssApplication;
import com.ural_nigmatullin.skssapplication.data.FakeNewsRepository;
import com.ural_nigmatullin.skssapplication.data.NewsItem;
import com.ural_nigmatullin.skssapplication.domain.NewsListInteractor;
import com.ural_nigmatullin.skssapplication.domain.NewsListInteractorInterface;
import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;
import com.ural_nigmatullin.skssapplication.ui.adapters.NewsListAdapter;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by enigm on 02/04/2018.
 */

public class NewsListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    @Inject
    NewsListInteractorInterface mNewsListInteractor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);

        ((SkssApplication)getActivity().getApplication()).getApplicationComponent().inject(this);

        mRecyclerView = fragmentView.findViewById(R.id.news_list_recycler_view);

        // Setting layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);

        // adding adapter to recyclerview
        NewsListAdapter newsListAdapter = new NewsListAdapter(mNewsListInteractor.getNewsList());
        mRecyclerView.setAdapter(newsListAdapter);
        return fragmentView;
    }
}
