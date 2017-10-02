package com.example.dd.retrofit1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dd.retrofit1.adapters.AdapterCompetition;
import com.example.dd.retrofit1.adapters.AdapterCompetitions;
import com.example.dd.retrofit1.adapters.AdapterPlayers;
import com.example.dd.retrofit1.adapters.AdapterTeams;
import com.example.dd.retrofit1.users.UserCompetitionsId;
import com.example.dd.retrofit1.users.UserCompetitions;
import com.example.dd.retrofit1.users.UserTeamsIdPlayers;
import com.example.dd.retrofit1.users.UserCompetitionsIdTeams;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dds86 on 29.09.2017.
 */

public class RetrofitInitialize extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public RetrofitInitialize(Context context, RecyclerView recyclerView, int id) {
        this.context = context;
        this.recyclerView = recyclerView;
        this.id = id;
    }

    public void retrofitCheckForNull() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public void getCompetitionsList() {

        //1
        retrofitCheckForNull();


        APIService service = retrofit.create(APIService.class);
        Call<List<UserCompetitions>> call = service.getApiCompetitions();
        call.enqueue(new Callback<List<UserCompetitions>>() {
            @Override
            public void onResponse(Call<List<UserCompetitions>> call, Response<List<UserCompetitions>> response) {

                List<UserCompetitions> data = response.body();
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);
                AdapterCompetitions recyclerViewAdapter = new AdapterCompetitions(context, data);
                recyclerView.setAdapter(recyclerViewAdapter);

            }

            @Override
            public void onFailure(Call<List<UserCompetitions>> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }

    public void getCompetitionList() {
        retrofitCheckForNull();

        APIService apiService = retrofit.create(APIService.class);
        Call<UserCompetitionsId> call2 = apiService.getApiCompetitionsId(id);
        call2.enqueue(new Callback<UserCompetitionsId>() {
            @Override
            public void onResponse(Call<UserCompetitionsId> call, Response<UserCompetitionsId> response) {

                UserCompetitionsId userList = response.body();
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);

                AdapterCompetition recyclerViewAdapter = new AdapterCompetition(context, userList, id);
                recyclerView.setAdapter(recyclerViewAdapter);
            }

            @Override
            public void onFailure(Call<UserCompetitionsId> call, Throwable t) {
                Log.d("123", t.getMessage());
            }

        });
    }

    public void getTeamsList() {

        retrofitCheckForNull();

        APIService service = retrofit.create(APIService.class);
        Call<UserCompetitionsIdTeams> call = service.getApiCompetitionsIdTeams(id);
        Log.i("autolog", "id: " + id);
        call.enqueue(new Callback<UserCompetitionsIdTeams>() {
            @Override
            public void onResponse(Call<UserCompetitionsIdTeams> call, Response<UserCompetitionsIdTeams> response) {


                UserCompetitionsIdTeams userList = response.body();
                Log.i("autolog", "userList: " + userList);
                ArrayList<UserCompetitionsIdTeams.Teams> data = new ArrayList<>(userList.getTeams());
                Log.i("autolog", "data: " + data);
                LinearLayoutManager layoutManager = new LinearLayoutManager(context);
                recyclerView.setLayoutManager(layoutManager);
                AdapterTeams recyclerViewAdapter = new AdapterTeams(context, data,id);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserCompetitionsIdTeams> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }

    public void getPlayersList() {

        retrofitCheckForNull();

        APIService service = retrofit.create(APIService.class);
        Call<UserTeamsIdPlayers> call = service.getApiTeamsIdPlayers(57);
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
                AdapterPlayers recyclerViewAdapter = new AdapterPlayers(context, data,id);
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void onFailure(Call<UserTeamsIdPlayers> call, Throwable t) {
                Log.d("123", t.getMessage());
            }
        });

    }


}
