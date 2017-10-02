package com.example.dd.retrofit1.competitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.dd.retrofit1.R;
import com.example.dd.retrofit1.RetrofitInitialize;


public class ActivityCompetitions extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RetrofitInitialize retrofitInitialize;
    private int openCompetition;
    private int idItemClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        openCompetition = getIntent().getIntExtra("openActivity", 0);
        idItemClicked = getIntent().getIntExtra("idCompetitionClicked", 0);

        switch (openCompetition) {
            case 1:
                retrofitInitialize = new RetrofitInitialize(this, recyclerView, idItemClicked);
                retrofitInitialize.getCompetitionList();
                break;
            case 2:
                retrofitInitialize = new RetrofitInitialize(this, recyclerView, idItemClicked);
                retrofitInitialize.getTeamsList();
                break;
            case 3:
                retrofitInitialize = new RetrofitInitialize(this, recyclerView, idItemClicked);
                retrofitInitialize.getPlayersList();
                break;
            default:
                retrofitInitialize = new RetrofitInitialize(this, recyclerView,0);
                retrofitInitialize.getCompetitionsList();
        }


    }
}
