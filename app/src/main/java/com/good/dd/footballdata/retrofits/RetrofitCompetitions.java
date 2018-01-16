package com.good.dd.footballdata.retrofits;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.APIService;
import com.good.dd.footballdata.adapters.AdapterCompetitions;
import com.good.dd.footballdata.users.UserCompetitions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitCompetitions extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitCompetitions(Context context, int id, RecyclerView recyclerView) {
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

    public void getRetrofitCompetitions() {

        //1
        isRetrofitNull();


        APIService service = retrofit.create(APIService.class);
        Call<List<UserCompetitions>> call = service.getApiCompetitions();
        call.enqueue(new Callback<List<UserCompetitions>>() {
            @Override
            public void onResponse(Call<List<UserCompetitions>> call, Response<List<UserCompetitions>> response) {


                List<UserCompetitions> data = response.body();
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                AdapterCompetitions recyclerViewAdapter = new AdapterCompetitions(context, data);


                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(recyclerViewAdapter);

            }

            @Override
            public void onFailure(Call<List<UserCompetitions>> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }
}
