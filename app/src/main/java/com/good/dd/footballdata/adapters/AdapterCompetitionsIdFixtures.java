package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.users.UserCompetitionsIdFixtures;

import java.util.ArrayList;


/**
 * Created by dds86 on 30.09.2017.
 */

public class AdapterCompetitionsIdFixtures extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<UserCompetitionsIdFixtures.Fixtures> data;
    private int idItemClicked;


    public AdapterCompetitionsIdFixtures(Context context, ArrayList<UserCompetitionsIdFixtures.Fixtures> data, int idItemClicked) {
        this.context = context;
        this.data = data;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_competitions_id_fixtures, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {




         String tvCompetitionsIdFixturesRight_date= String.valueOf(data.get(position).getDate());
         String tvCompetitionsIdFixturesRight_status= String.valueOf(data.get(position).getStatus());
         String tvCompetitionsIdFixturesRight_matchday= String.valueOf(data.get(position).getMatchday());
         String tvCompetitionsIdFixturesRight_homeTeamName= String.valueOf(data.get(position).getHomeTeamName());
         String tvCompetitionsIdFixturesRight_awayTeamName= String.valueOf(data.get(position).getAwayTeamName());
         String tvCompetitionsIdFixturesRight_goalsHomeTeam= String.valueOf(data.get(position).getResult().getGoalsHomeTeam());
         String tvCompetitionsIdFixturesRight_goalsAwayTeam= String.valueOf(data.get(position).getResult().getGoalsAwayTeam());

        holder.tvCompetitionsIdFixturesRight_date.setText(tvCompetitionsIdFixturesRight_date);
        holder.tvCompetitionsIdFixturesRight_status.setText(tvCompetitionsIdFixturesRight_status);
        holder.tvCompetitionsIdFixturesRight_matchday.setText(tvCompetitionsIdFixturesRight_matchday);
        holder.tvCompetitionsIdFixturesRight_homeTeamName.setText(tvCompetitionsIdFixturesRight_homeTeamName);
        holder.tvCompetitionsIdFixturesRight_awayTeamName.setText(tvCompetitionsIdFixturesRight_awayTeamName);
        holder.tvCompetitionsIdFixturesRight_goalsHomeTeam.setText(tvCompetitionsIdFixturesRight_goalsHomeTeam);
        holder.tvCompetitionsIdFixturesRight_goalsAwayTeam.setText(tvCompetitionsIdFixturesRight_goalsAwayTeam);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
