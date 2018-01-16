package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.adapters.AdapterCompetitionsIdTeams;
import com.good.dd.footballdata.api.ApiCompetitionsIdTeams;
import com.good.dd.footballdata.users.UserCompetitionsIdTeams;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitCompetitionsIdTeams extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitCompetitionsIdTeams(Context context, int id, RecyclerView recyclerView) {
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

    public void getRetrofitCompetitionsIdTeams() {

        isRetrofitNull();

        ApiCompetitionsIdTeams apiCompetitionsIdTeams = retrofit.create(ApiCompetitionsIdTeams.class);
        Call<UserCompetitionsIdTeams> call = apiCompetitionsIdTeams.getApiCompetitionsIdTeams(id);
        call.enqueue(new Callback<UserCompetitionsIdTeams>() {
            @Override
            public void onResponse(Call<UserCompetitionsIdTeams> call, Response<UserCompetitionsIdTeams> response) {

                UserCompetitionsIdTeams userList = response.body();
                ArrayList<UserCompetitionsIdTeams.Teams> data = new ArrayList<>(userList.getTeams());
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                AdapterCompetitionsIdTeams recyclerViewAdapter = new AdapterCompetitionsIdTeams(context, data, id);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserCompetitionsIdTeams> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }




}
