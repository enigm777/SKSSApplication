package com.ural_nigmatullin.skssapplication.data.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by enigm on 08/04/2018.
 */

public interface SkssApi {

    @GET("/news/list")
    Call<List<NewsItemModel>> getNewsList();
}
