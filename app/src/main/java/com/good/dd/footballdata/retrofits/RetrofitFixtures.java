package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.adapters.AdapterFixtures;
import com.good.dd.footballdata.api.ApiFixtures;
import com.good.dd.footballdata.users.UserFixtures;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitFixtures extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitFixtures(Context context, int id, RecyclerView recyclerView) {
        this.context = context;
        this.id = id;
        this.recyclerView=recyclerView;
    }

    public void isRetrofitNull() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
    }

    public void getRetrofitFixtures() {

        isRetrofitNull();

        ApiFixtures apiFixtures = retrofit.create(ApiFixtures.class);
        Call<UserFixtures> call = apiFixtures.getApiFixtures();

        call.enqueue(new Callback<UserFixtures>() {
            @Override
            public void onResponse(Call<UserFixtures> call, Response<UserFixtures> response) {

                UserFixtures userList = response.body();
                ArrayList<UserFixtures.Fixtures> data = new ArrayList<>(userList.getFixtures());
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);
                AdapterFixtures recyclerViewAdapter = new AdapterFixtures(context, data, id);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserFixtures> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }





}
