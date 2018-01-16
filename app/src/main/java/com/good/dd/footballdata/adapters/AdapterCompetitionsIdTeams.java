package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.activities.ActivityTeamsIdPlayers;
import com.good.dd.footballdata.users.UserCompetitionsIdTeams;

import java.util.ArrayList;


/**
 * Created by dds86 on 30.09.2017.
 */

public class AdapterCompetitionsIdTeams extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<UserCompetitionsIdTeams.Teams> teams;
    private int idItemClicked;

    public AdapterCompetitionsIdTeams(Context context, ArrayList<UserCompetitionsIdTeams.Teams> teams, int idItemClicked) {
        this.context = context;
        this.teams = teams;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_competitions_id_teams, parent, false);
        Button btnTeams = (Button) view.findViewById(R.id.btnTeamPlayers);
        btnTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityTeamsIdPlayers.class);

                intent.putExtra("idCompetitionClicked", idItemClicked);
                context.startActivity(intent);
            }
        });

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.tvTeamName.setText(teams.get(position).getName());
        String urlImage = String.valueOf(teams.get(position).getCrestUrl());

        //TODO: Check how to load svg images
        Glide
                .with(context)
                .load(urlImage)
                .into(holder.tvTeamCrestUrl);




    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
