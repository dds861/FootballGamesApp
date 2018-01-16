package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.retrofits.RetrofitCompetitionsId;


public class ActivityCompetitionsId extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RetrofitCompetitionsId retrofitCompetitionsId;

    private int idCompetitionClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id);

        Log.i("autolog","ActivityCompetitionsId");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id);
        idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        retrofitCompetitionsId = new RetrofitCompetitionsId(this, idCompetitionClicked,recyclerView);
        retrofitCompetitionsId.getRetrofitCompetitionsId();


    }
}
