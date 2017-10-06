package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.good.dd.footballdata.CreateRetrofit;
import com.good.dd.footballdata.R;


public class ActivityCompetitionsIdLeagueTable extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id_league_table);


        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id_league_table);
        CreateRetrofit createRetrofit = new CreateRetrofit(this, idCompetitionClicked, recyclerView);
        createRetrofit.getRetrofitCompetitionsIdLeagueTable();


    }


}

