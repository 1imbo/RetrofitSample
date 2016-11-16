package net.boot.resttestapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import net.boot.resttestapplication.R;
import net.boot.resttestapplication.apicall.CustomSearchRestApi;
import net.boot.resttestapplication.managers.HttpApiClientManager;
import net.boot.resttestapplication.model.Item;
import net.boot.resttestapplication.model.SearchResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpApiClientManager.getInstance().getSearchServiceFacade().doCustomSearch(
                "AIzaSyC2zdrME0Njc2mridW_t56vG46NWg901g4",
                "017576662512468239146:omuauf_lfve",
                "Jack London").enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                Log.d("TAG", call.toString());
                List<Item> list = response.body().getItems();


            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Log.d("TAG", call.toString());
            }
        });
    }
}
