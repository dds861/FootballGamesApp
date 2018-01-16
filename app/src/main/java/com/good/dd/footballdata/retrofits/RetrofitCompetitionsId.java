package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.APIService;
import com.good.dd.footballdata.adapters.AdapterCompetitionsId;
import com.good.dd.footballdata.users.UserCompetitionsId;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitCompetitionsId extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitCompetitionsId(Context context, int id, RecyclerView recyclerView) {
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


    public void getRetrofitCompetitionsId() {
        isRetrofitNull();

        APIService apiService = retrofit.create(APIService.class);
        Call<UserCompetitionsId> call2 = apiService.getApiCompetitionsId(id);
        call2.enqueue(new Callback<UserCompetitionsId>() {
            @Override
            public void onResponse(Call<UserCompetitionsId> call, Response<UserCompetitionsId> response) {
                UserCompetitionsId userList = response.body();
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);

                AdapterCompetitionsId recyclerViewAdapter = new AdapterCompetitionsId(context, userList, id);
                recyclerView.setAdapter(recyclerViewAdapter);
            }

            @Override
            public void onFailure(Call<UserCompetitionsId> call, Throwable t) {
                Log.d("123", t.getMessage());
            }

        });
    }
}
