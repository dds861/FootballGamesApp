package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.adapters.AdapterTeamsIdPlayers;
import com.good.dd.footballdata.api.ApiTeamsIdPlayers;
import com.good.dd.footballdata.users.UserTeamsIdPlayers;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitTeamsIdPlayers extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitTeamsIdPlayers(Context context, int id, RecyclerView recyclerView) {
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




    public void getRetrofitTeamsIdPlayers() {

        isRetrofitNull();

        ApiTeamsIdPlayers apiTeamsIdPlayers = retrofit.create(ApiTeamsIdPlayers.class);
        Call<UserTeamsIdPlayers> call = apiTeamsIdPlayers.getApiTeamsIdPlayers(57);
        Log.i("autolog", "id: " + id);
        call.enqueue(new Callback<UserTeamsIdPlayers>() {
            @Override
            public void onResponse(Call<UserTeamsIdPlayers> call, Response<UserTeamsIdPlayers> response) {


                UserTeamsIdPlayers userList = response.body();
                Log.i("autolog", "userList: " + userList);
                ArrayList<UserTeamsIdPlayers.Players> data = new ArrayList<>(userList.getPlayers());
                Log.i("autolog", "data: " + data);
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);
                AdapterTeamsIdPlayers recyclerViewAdapter = new AdapterTeamsIdPlayers(context, data, id);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserTeamsIdPlayers> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }



}
