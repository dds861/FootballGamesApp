package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.good.dd.footballdata.CreateRetrofit;
import com.good.dd.footballdata.R;


public class ActivityTeamsIdPlayers extends AppCompatActivity {
    private CreateRetrofit createRetrofit;
    private int idCompetitionClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions);




    }
}
