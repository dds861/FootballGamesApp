package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitCompetitionsIdFixtures;


public class ActivityCompetitionsIdFixtures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id_fixtures);


        Log.i("autolog","ActivityCompetitionsIdFixtures");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id_fixtures);
        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RetrofitCompetitionsIdFixtures retrofitCompetitionsIdFixtures = new RetrofitCompetitionsIdFixtures(this, idCompetitionClicked, recyclerView);
        retrofitCompetitionsIdFixtures.getRetrofitCompetitionsIdFixtures();


    }
}
