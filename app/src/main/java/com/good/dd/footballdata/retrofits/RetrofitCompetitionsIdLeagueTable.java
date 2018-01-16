package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.adapters.AdapterCompetitionsIdLeagueTable;
import com.good.dd.footballdata.api.ApiCompetitionsIdLeagueTable;
import com.good.dd.footballdata.users.UserCompetitionsIdLeagueTable;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitCompetitionsIdLeagueTable extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitCompetitionsIdLeagueTable(Context context, int id, RecyclerView recyclerView) {
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


    public void getRetrofitCompetitionsIdLeagueTable() {

        isRetrofitNull();

        ApiCompetitionsIdLeagueTable apiCompetitionsIdLeagueTable = retrofit.create(ApiCompetitionsIdLeagueTable.class);
        Call<UserCompetitionsIdLeagueTable> call = apiCompetitionsIdLeagueTable.getApiCompetitionsIdLeagueTable(id);
        Log.i("autolog", "id: " + id);
        call.enqueue(new Callback<UserCompetitionsIdLeagueTable>() {
            @Override
            public void onResponse(Call<UserCompetitionsIdLeagueTable> call, Response<UserCompetitionsIdLeagueTable> response) {

                UserCompetitionsIdLeagueTable userList = response.body();
                ArrayList<UserCompetitionsIdLeagueTable.Standing> data = new ArrayList<>(userList.getStanding());
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);
                AdapterCompetitionsIdLeagueTable recyclerViewAdapter = new AdapterCompetitionsIdLeagueTable(context, data, id);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserCompetitionsIdLeagueTable> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }


}
