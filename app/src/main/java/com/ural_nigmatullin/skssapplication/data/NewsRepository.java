package com.ural_nigmatullin.skssapplication.data;

import com.ural_nigmatullin.skssapplication.data.network.NewsItemModel;
import com.ural_nigmatullin.skssapplication.data.network.SkssApi;
import com.ural_nigmatullin.skssapplication.domain.NewsRepositoryInterface;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by enigm on 08/04/2018.
 */

public class NewsRepository implements NewsRepositoryInterface {

    private List<NewsItem> mNewsList;
    private SkssApi mSkssApi;

    public NewsRepository(SkssApi skssApi){
        mSkssApi = skssApi;
    }

    @Override
    public List<NewsItem> getNews() {
        loadNewsFromNetwork();
        return mNewsList;
    }

    private void loadNewsFromNetwork(){
        new CompositeDisposable().add(mSkssApi.getNewsList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .flatMapIterable(newsItemModels -> newsItemModels)
                .map(newsItemModel -> new NewsItem(newsItemModel.getTitle(), null, newsItemModel.getContent()))
                .toList()
                .subscribe(this::handleResponse));
    }

    private void handleResponse(List<NewsItem> newsList){
        mNewsList.addAll(newsList);
    }
}
