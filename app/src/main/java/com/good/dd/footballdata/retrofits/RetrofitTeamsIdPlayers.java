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
        Log.i("autolog", "RetrofitTeamsIdPlayers: ");
        this.context = context;
        this.id = id;
        this.recyclerView = recyclerView;
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
        Log.i("autolog", "getRetrofitTeamsIdPlayers: ");

        isRetrofitNull();

        ApiTeamsIdPlayers apiTeamsIdPlayers = retrofit.create(ApiTeamsIdPlayers.class);
        Call<UserTeamsIdPlayers> call = apiTeamsIdPlayers.getApiTeamsIdPlayers(86);
        call.enqueue(new Callback<UserTeamsIdPlayers>() {
            @Override
            public void onResponse(Call<UserTeamsIdPlayers> call, Response<UserTeamsIdPlayers> response) {


                //Получааю с сервера обьект UserTeamsIdPlayers
                UserTeamsIdPlayers userList = response.body();

                //Из полученного обьекта выкачиваю список играков
                ArrayList<UserTeamsIdPlayers.Players> data = new ArrayList<>(userList.getPlayers());

                //Создаю LinearLayoutManager
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);

                //В recyclerView устанавливаю созданный layoutManager
                recyclerView.setLayoutManager(layoutManager);

                //Создаю адаптер
                AdapterTeamsIdPlayers adapterTeamsIdPlayers = new AdapterTeamsIdPlayers(context, data, id);

                //Устанавливаю адаптер в recyclerView
                recyclerView.setAdapter(adapterTeamsIdPlayers);


            }

            @Override
            public void onFailure(Call<UserTeamsIdPlayers> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }


}
