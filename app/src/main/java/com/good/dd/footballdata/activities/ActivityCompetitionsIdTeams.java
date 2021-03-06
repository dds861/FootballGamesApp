package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitCompetitionsIdTeams;


public class ActivityCompetitionsIdTeams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id_teams);

        Log.i("autolog","ActivityCompetitionsIdTeams");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id_teams);
        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RetrofitCompetitionsIdTeams retrofitCompetitionsIdTeams = new RetrofitCompetitionsIdTeams(this, idCompetitionClicked, recyclerView);
        retrofitCompetitionsIdTeams.getRetrofitCompetitionsIdTeams();


    }
}
