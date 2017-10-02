package com.example.dd.retrofit1.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dd.retrofit1.R;
import com.example.dd.retrofit1.ViewHolder;
import com.example.dd.retrofit1.competitions.ActivityCompetitions;
import com.example.dd.retrofit1.users.UserCompetitionsId;


/**
 * Created by dd on 09.05.2017.
 */

public class AdapterCompetition extends RecyclerView.Adapter<ViewHolder> {

    private UserCompetitionsId item;
    private Context context;
    private int idItemClicked;


    public AdapterCompetition(Context context, UserCompetitionsId item, int idItemClicked) {
        this.context = context;
        this.item = item;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public com.example.dd.retrofit1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_competition, parent, false);

        Button btnTeams = (Button) view.findViewById(R.id.btnTeams);
        btnTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityCompetitions.class);
                intent.putExtra("openActivity", 2);
                intent.putExtra("idCompetitionClicked", idItemClicked);
                context.startActivity(intent);
            }
        });
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(com.example.dd.retrofit1.ViewHolder holder, int position) {

//TODO: check the difference between back button in ActionBar and goBack
        String getCaption = item.getCaption();
        String getLeague = item.getLeague();
        String getYear = item.getYear();
        String getCurrentMatchday = String.valueOf(item.getCurrentMatchday());
        String getNumberOfMatchdays = String.valueOf(item.getNumberOfMatchdays());
        String getNumberOfTeams = String.valueOf(item.getNumberOfTeams());
        String getNumberOfGames = String.valueOf(item.getNumberOfGames());
        String getLastUpdated = item.getLastUpdated();

        holder.tvCompetitionCaptionRight.setText(getCaption);
        holder.tvCompetitionLeagueRight.setText(getLeague);
        holder.tvCompetitionYearRight.setText(getYear);
        holder.tvCompetitionCurrentMatchDayRight.setText(String.valueOf(getCurrentMatchday));
        holder.tvCompetitionNumberOfMatchdaysRight.setText(String.valueOf(getNumberOfMatchdays));
        holder.tvCompetitionNumberOfTeamsRight.setText(String.valueOf(getNumberOfTeams));
        holder.tvCompetitionNumberOfGamesRight.setText(String.valueOf(getNumberOfGames));
        holder.tvCompetitionLastUpdatedRight.setText(getLastUpdated);


    }


    @Override
    public int getItemCount() {

        return 1;
    }


}

