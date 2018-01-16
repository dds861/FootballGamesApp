package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitCompetitions;


public class ActivityCompetitions extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions);

        Log.i("autolog","ActivityCompetitions");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_teams_id_players);
        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RetrofitCompetitions retrofitCompetitions = new RetrofitCompetitions(this, idCompetitionClicked, recyclerView);
        retrofitCompetitions.getRetrofitCompetitions();
    }


}

