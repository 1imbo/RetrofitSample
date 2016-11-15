package net.boot.resttestapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.boot.resttestapplication.R;
import net.boot.resttestapplication.apicall.CustomSearchRestApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
