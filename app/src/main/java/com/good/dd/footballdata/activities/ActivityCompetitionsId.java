package com.good.dd.footballdata.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.good.dd.footballdata.CreateRetrofit;
import com.good.dd.footballdata.R;


public class ActivityCompetitionsId extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CreateRetrofit createRetrofit;

    private int idCompetitionClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_id);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_competitions_id);
        idCompetitionClicked = getIntent().getIntExtra("idCompetitionClicked", 0);
        createRetrofit = new CreateRetrofit(this, idCompetitionClicked,recyclerView);
        createRetrofit.getRetrofitCompetitionsId();


    }
}
