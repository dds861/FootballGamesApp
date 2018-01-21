package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import java.util.Arrays;
import java.util.List;


/**
 * Created by dds86 on 30.09.2017.
 */

public class AdapterCompetitionsIdTeams extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<UserCompetitionsIdTeams.Teams> teams;
    private int idItemClicked;
    Button btnTeams;

    public AdapterCompetitionsIdTeams(Context context, ArrayList<UserCompetitionsIdTeams.Teams> teams, int idItemClicked) {
        this.context = context;
        this.teams = teams;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_competitions_id_teams, parent, false);

        btnTeams = (Button) view.findViewById(R.id.btnTeamPlayers);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.i("autolog", "getSelf(): " + teams.get(position).get_links().getSelf().getHref());


        holder.tvTeamName.setText(teams.get(position).getName());
        String urlImage = String.valueOf(teams.get(position).getCrestUrl());

        //TODO: Check how to load svg images
        Glide
                .with(context)
                .load(urlImage)
                .into(holder.tvTeamCrestUrl);


        btnTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Log.i("autolog", "getSelf(): " + teams.get(position).get_links().getSelf().getHref());
                String link = teams.get(position).get_links().getSelf().getHref();

                List<String> items = Arrays.asList(link.split("/"));
                Log.i("autolog", "items last: " + items.get(items.size()-1));


                Log.i("autolog", "position: " + position);
                Intent intent = new Intent(context, ActivityTeamsIdPlayers.class);


                intent.putExtra("idCompetitionClicked", idItemClicked);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
