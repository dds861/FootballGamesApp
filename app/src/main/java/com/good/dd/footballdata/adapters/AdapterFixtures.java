package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.users.UserFixtures;

import java.util.ArrayList;


/**
 * Created by dds86 on 30.09.2017.
 */

public class AdapterFixtures extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<UserFixtures.Fixtures> data;
    private int idItemClicked;


    public AdapterFixtures(Context context, ArrayList<UserFixtures.Fixtures> data, int idItemClicked) {
        this.context = context;
        this.data = data;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_fixtures, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String tvFixturesRight_date = String.valueOf(data.get(position).getDate());
        String tvFixturesRight_status = String.valueOf(data.get(position).getStatus());
        String tvFixturesRight_matchday = String.valueOf(data.get(position).getMatchday());
        String tvFixturesRight_homeTeamName = String.valueOf(data.get(position).getHomeTeamName());
        String tvFixturesRight_awayTeamName = String.valueOf(data.get(position).getAwayTeamName());
        String tvFixturesRight_odds = String.valueOf(data.get(position).getOdds());
        String tvFixturesRight_goalsHomeTeam = String.valueOf(data.get(position).getResult().getGoalsAwayTeam());
        String tvFixturesRight_goalsAwayTeam = String.valueOf(data.get(position).getResult().getGoalsAwayTeam());

        holder.tvFixturesRight_date.setText(tvFixturesRight_date);
        holder.tvFixturesRight_status.setText(tvFixturesRight_status);
        holder.tvFixturesRight_matchday.setText(tvFixturesRight_matchday);
        holder.tvFixturesRight_homeTeamName.setText(tvFixturesRight_homeTeamName);
        holder.tvFixturesRight_awayTeamName.setText(tvFixturesRight_awayTeamName);
        holder.tvFixturesRight_odds.setText(tvFixturesRight_odds);
        holder.tvFixturesRight_goalsHomeTeam.setText(tvFixturesRight_goalsHomeTeam);
        holder.tvFixturesRight_goalsAwayTeam.setText(tvFixturesRight_goalsAwayTeam);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
