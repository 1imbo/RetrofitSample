package net.boot.resttestapplication.apicall;

import net.boot.resttestapplication.model.SearchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Dmitry on 14.11.2016.
 */

public interface CustomSearchRestApi {
    @GET("customsearch/v1")
    Call<SearchResult> doCustomSearch(@Query("key") String apiKey, @Query("cx") String cseId, @Query("q") String query);
}
