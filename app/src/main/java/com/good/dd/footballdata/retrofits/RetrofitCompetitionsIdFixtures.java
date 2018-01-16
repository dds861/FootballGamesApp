package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.APIService;
import com.good.dd.footballdata.adapters.AdapterCompetitionsIdFixtures;
import com.good.dd.footballdata.adapters.AdapterFixtures;
import com.good.dd.footballdata.adapters.AdapterTeamsIdPlayers;
import com.good.dd.footballdata.users.UserCompetitionsIdFixtures;
import com.good.dd.footballdata.users.UserFixtures;
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

public class RetrofitCompetitionsIdFixtures extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitCompetitionsIdFixtures(Context context, int id, RecyclerView recyclerView) {
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


    public void getRetrofitCompetitionsIdFixtures() {

        isRetrofitNull();

        APIService service = retrofit.create(APIService.class);
        Call<UserCompetitionsIdFixtures> call = service.getApiCompetitionsIdFixtures(id);
        Log.i("autolog", "id: " + id);
        call.enqueue(new Callback<UserCompetitionsIdFixtures>() {
            @Override
            public void onResponse(Call<UserCompetitionsIdFixtures> call, Response<UserCompetitionsIdFixtures> response) {

                UserCompetitionsIdFixtures userList = response.body();
                ArrayList<UserCompetitionsIdFixtures.Fixtures> data = new ArrayList<>(userList.getFixtures());
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);
                AdapterCompetitionsIdFixtures recyclerViewAdapter = new AdapterCompetitionsIdFixtures(context, data, id);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserCompetitionsIdFixtures> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }




}
