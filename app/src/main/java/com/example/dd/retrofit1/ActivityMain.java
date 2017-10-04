package com.example.dd.retrofit1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dd.retrofit1.activities.ActivityCompetitions;
import com.example.dd.retrofit1.activities.ActivityFixtures;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {


    private Button mBtnCompetitions;
    private Button mBtnFixtures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Log.i("autolog", "initView();: ");


    }

    private void initView() {
        mBtnCompetitions = (Button) findViewById(R.id.btnCompetitions);
        Log.i("autolog", "mBtnCompetitions = (Button) findViewById(R.id.btnCompetitions);: ");
        mBtnCompetitions.setOnClickListener(this);
        Log.i("autolog", "mBtnCompetitions.setOnClickListener(this);: ");
        mBtnFixtures = (Button) findViewById(R.id.btnFixtures);
        Log.i("autolog", "mBtnFixtures = (Button) findViewById(R.id.btnFixtures);: ");
        mBtnFixtures.setOnClickListener(this);
        Log.i("autolog", "mBtnFixtures.setOnClickListener(this);: ");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCompetitions:
                Intent intentCompetitions = new Intent(this, ActivityCompetitions.class);
                Log.i("autolog", "Intent intentCompetitions = new Intent(this, ActivityCompetitions.class);: ");
                startActivity(intentCompetitions);

                Log.i("autolog", "startActivity(intentCompetitions);: ");
                break;
            case R.id.btnFixtures:
                Intent intentFixtures = new Intent(this, ActivityFixtures.class);
                Log.i("autolog", "intentFixtures: " + intentFixtures);
                startActivity(intentFixtures);
                Log.i("autolog", "startActivity(intentFixtures);: ");
                break;

            default:
                break;
        }
    }
}
