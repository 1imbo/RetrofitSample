package net.boot.resttestapplication.managers;

import net.boot.resttestapplication.apicall.CustomSearchRestApi;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dmitry on 15.11.2016.
 */

public class HttpApiClientManager {
    private static final String BASE_URL = "https://www.googleapis.com/";
    private static final String API_KEY_PARAM_NAME = "key";
    private static final String API_KEY = "AIzaSyC2zdrME0Njc2mridW_t56vG46NWg901g4";

    private static HttpApiClientManager instance;

    private CustomSearchRestApi searchServiceFacade;

    public static HttpApiClientManager getInstance() {
        if (instance == null) {
            instance = new HttpApiClientManager();
        }
        return instance;
    }

    private HttpApiClientManager() {
        OkHttpClient okHttpClient = new OkHttpClient();

        /*okHttpClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                HttpUrl url = request
                        .url()
                        .newBuilder()
                        .addQueryParameter(API_KEY_PARAM_NAME, API_KEY)
                        .build();
                request = request.newBuilder().url(url).build();
                return chain.proceed(request);
            }
        });*/

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        searchServiceFacade = retrofit.create(CustomSearchRestApi.class);
    }

    public CustomSearchRestApi getSearchServiceFacade() {
        return searchServiceFacade;
    }
}
