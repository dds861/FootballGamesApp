package com.example.dd.retrofit1.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.dd.retrofit1.CreateRetrofit;
import com.example.dd.retrofit1.R;


public class ActivityCompetitionsIdTeams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id_teams);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id_teams);
        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        CreateRetrofit createRetrofit = new CreateRetrofit(this, idCompetitionClicked, recyclerView);
        createRetrofit.getRetrofitCompetitionsIdTeams();


    }
}
