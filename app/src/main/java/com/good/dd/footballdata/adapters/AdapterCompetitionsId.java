package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.good.dd.footballdata.activities.ActivityCompetitionsIdFixtures;
import com.good.dd.footballdata.activities.ActivityCompetitionsIdLeagueTable;
import com.good.dd.footballdata.activities.ActivityCompetitionsIdTeams;
import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.users.UserCompetitionsId;


/**
 * Created by dd on 09.05.2017.
 */

public class AdapterCompetitionsId extends RecyclerView.Adapter<ViewHolder> {

    private UserCompetitionsId item;
    private Context context;
    private int idItemClicked;


    public AdapterCompetitionsId(Context context, UserCompetitionsId item, int idItemClicked) {
        this.context = context;
        this.item = item;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public com.good.dd.footballdata.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_competitions_id, parent, false);

        Button btnTeams = (Button) view.findViewById(R.id.btnCompetitionsIdTeams);
        btnTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityCompetitionsIdTeams.class);
                intent.putExtra("idCompetitionClicked", idItemClicked);
                context.startActivity(intent);
            }
        });

        Button btnLeagueTable = (Button) view.findViewById(R.id.btnCompetitionsIdLeagueTable);
        btnLeagueTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityCompetitionsIdLeagueTable.class);
                intent.putExtra("idCompetitionClicked", idItemClicked);
                context.startActivity(intent);
            }
        });

        Button btnFixtures = (Button) view.findViewById(R.id.btnCompetitionsIdFixtures);
        btnFixtures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityCompetitionsIdFixtures.class);
                intent.putExtra("idCompetitionClicked", idItemClicked);
                context.startActivity(intent);
            }
        });
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(com.good.dd.footballdata.ViewHolder holder, int position) {

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

