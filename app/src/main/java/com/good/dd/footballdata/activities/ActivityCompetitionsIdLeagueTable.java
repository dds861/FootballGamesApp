package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitCompetitionsIdLeagueTable;


public class ActivityCompetitionsIdLeagueTable extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id_league_table);

        Log.i("autolog","ActivityCompetitionsIdLeagueTable");


        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id_league_table);
        RetrofitCompetitionsIdLeagueTable retrofitCompetitionsIdLeagueTable = new RetrofitCompetitionsIdLeagueTable(this, idCompetitionClicked, recyclerView);
        retrofitCompetitionsIdLeagueTable.getRetrofitCompetitionsIdLeagueTable();


    }


}

