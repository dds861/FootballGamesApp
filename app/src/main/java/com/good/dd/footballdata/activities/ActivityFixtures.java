package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitFixtures;

public class ActivityFixtures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);

        Log.i("autolog","ActivityFixtures");


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_fixtures);
        int idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        RetrofitFixtures retrofitFixtures = new RetrofitFixtures(this, idCompetitionClicked, recyclerView);
        retrofitFixtures.getRetrofitFixtures();
    }
}
