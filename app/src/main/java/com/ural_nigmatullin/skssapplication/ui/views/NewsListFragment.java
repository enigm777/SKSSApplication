package com.ural_nigmatullin.skssapplication.ui.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ural_nigmatullin.skssapplication.R;
import com.ural_nigmatullin.skssapplication.SkssApplication;
import com.ural_nigmatullin.skssapplication.data.ArticleItem;
import com.ural_nigmatullin.skssapplication.domain.ArticleListInteractorInterface;
import com.ural_nigmatullin.skssapplication.ui.adapters.NewsListAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by enigm on 02/04/2018.
 */

public class NewsListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private NewsListAdapter mNewsListAdapter;

    @Inject
    ArticleListInteractorInterface mNewsListInteractor;

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
        mNewsListAdapter = new NewsListAdapter(new ArrayList<>());
        mRecyclerView.setAdapter(mNewsListAdapter);

        // item decoration
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                layoutManager.getOrientation());
        mRecyclerView.addItemDecoration(dividerItemDecoration);

        // retrieving news list
        new CompositeDisposable(mNewsListInteractor.getNewsList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleNewsListLoaded, this::onError));
        return fragmentView;
    }

    private void handleNewsListLoaded(List<ArticleItem> newsItems){
        mNewsListAdapter.setNewsItemList(newsItems);
    }

    private void onError(Throwable throwable) {
        Log.e(NewsListFragment.class.getSimpleName(), "Couldn't load news list!!!");
    }
}
