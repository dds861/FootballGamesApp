package com.good.dd.footballdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.good.dd.footballdata.activities.ActivityCompetitions;
import com.good.dd.footballdata.activities.ActivityFixtures;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {


    private Button mBtnCompetitions;
    private Button mBtnFixtures;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    private void initView() {
        mBtnCompetitions = (Button) findViewById(R.id.btnCompetitions);
        mBtnCompetitions.setOnClickListener(this);
        mBtnFixtures = (Button) findViewById(R.id.btnFixtures);
        mBtnFixtures.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCompetitions:
                Intent intentCompetitions = new Intent(this, ActivityCompetitions.class);
                startActivity(intentCompetitions);

                break;
            case R.id.btnFixtures:
                Intent intentFixtures = new Intent(this, ActivityFixtures.class);
                startActivity(intentFixtures);
                break;

            default:
                break;
        }
    }
}
