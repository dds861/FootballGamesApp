package com.example.dd.retrofit1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dd.retrofit1.adapters.AdapterCompetitions;
import com.example.dd.retrofit1.adapters.AdapterCompetitionsId;
import com.example.dd.retrofit1.adapters.AdapterCompetitionsIdLeagueTable;
import com.example.dd.retrofit1.adapters.AdapterCompetitionsIdTeams;
import com.example.dd.retrofit1.adapters.AdapterTeamsIdPlayers;
import com.example.dd.retrofit1.users.UserCompetitions;
import com.example.dd.retrofit1.users.UserCompetitionsId;
import com.example.dd.retrofit1.users.UserCompetitionsIdLeagueTable;
import com.example.dd.retrofit1.users.UserCompetitionsIdTeams;
import com.example.dd.retrofit1.users.UserTeamsIdPlayers;

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

public class CreateRetrofit extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private int id;
    private String url = "http://api.football-data.org/";
    private Retrofit retrofit = null;

    public CreateRetrofit(Context context, int id, RecyclerView recyclerView) {
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

    public void getRetrofitCompetitionsIdTeams() {

        isRetrofitNull();

        APIService service = retrofit.create(APIService.class);
        Call<UserCompetitionsIdTeams> call = service.getApiCompetitionsIdTeams(id);
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

    public void getRetrofitCompetitionsIdLeagueTable() {

        isRetrofitNull();

        APIService service = retrofit.create(APIService.class);
        Call<UserCompetitionsIdLeagueTable> call = service.getApiCompetitionsIdLeagueTable(id);
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

    public void getRetrofitTeamsIdPlayers() {

        isRetrofitNull();

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
