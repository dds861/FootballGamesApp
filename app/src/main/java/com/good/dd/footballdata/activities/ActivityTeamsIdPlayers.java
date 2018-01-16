package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitTeamsIdPlayers;


public class ActivityTeamsIdPlayers extends AppCompatActivity {
    private int idCompetitionClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions);

        Log.i("autolog", "ActivityTeamsIdPlayers");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_teams_id_players);
        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RetrofitTeamsIdPlayers retrofitTeamsIdPlayers = new RetrofitTeamsIdPlayers(this, idCompetitionClicked, recyclerView);
        retrofitTeamsIdPlayers.getRetrofitTeamsIdPlayers();

    }
}
