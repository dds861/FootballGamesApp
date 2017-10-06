package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.users.UserCompetitionsIdLeagueTable;

import java.util.ArrayList;


/**
 * Created by dds86 on 30.09.2017.
 */

public class AdapterCompetitionsIdLeagueTable extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<UserCompetitionsIdLeagueTable.Standing> data;
    private int idItemClicked;

    public AdapterCompetitionsIdLeagueTable(Context context, ArrayList<UserCompetitionsIdLeagueTable.Standing> data, int idItemClicked) {
        this.context = context;
        this.data = data;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_competitions_id_league_table, parent, false);
//        Button btnTeams = (Button) view.findViewById(R.id.btnTeamPlayers);
//        btnTeams.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, MainActivity.class);
//                intent.putExtra("openActivity", 3);
//                intent.putExtra("idCompetitionClicked", idItemClicked);
//                context.startActivity(intent);
//            }
//        });
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        String tvCompetitionsIdLeagueTableRight_teamName            = data.get(position).getTeamName();
        String tvCompetitionsIdLeagueTableRight_position            = String.valueOf(data.get(position).getPosition());
        String tvCompetitionsIdLeagueTableRight_playedGames         = String.valueOf(data.get(position).getPlayedGames());
        String tvCompetitionsIdLeagueTableRight_points              = String.valueOf(data.get(position).getPoints());
        String tvCompetitionsIdLeagueTableRight_goals               = String.valueOf(data.get(position).getGoals());
        String tvCompetitionsIdLeagueTableRight_goalsAgainst        = String.valueOf(data.get(position).getGoalsAgainst());
        String tvCompetitionsIdLeagueTableRight_goalDifference      = String.valueOf(data.get(position).getGoalDifference());
        String tvCompetitionsIdLeagueTableRight_wins                = String.valueOf(data.get(position).getWins());
        String tvCompetitionsIdLeagueTableRight_draws               = String.valueOf(data.get(position).getDraws());
        String tvCompetitionsIdLeagueTableRight_losses              = String.valueOf(data.get(position).getLosses());
        String tvCompetitionsIdLeagueTableRight_homeGoals           = String.valueOf(data.get(position).getHome().getGoals());
        String tvCompetitionsIdLeagueTableRight_homeGoalsAgainst    = String.valueOf(data.get(position).getHome().getGoalsAgainst());
        String tvCompetitionsIdLeagueTableRight_homeWins            = String.valueOf(data.get(position).getHome().getWins());
        String tvCompetitionsIdLeagueTableRight_homeDraws           = String.valueOf(data.get(position).getHome().getDraws());
        String tvCompetitionsIdLeagueTableRight_homeLosses          = String.valueOf(data.get(position).getHome().getLosses());
        String tvCompetitionsIdLeagueTableRight_awayGoals           = String.valueOf(data.get(position).getAway().getGoals());
        String tvCompetitionsIdLeagueTableRight_awayGoalsAgainst    = String.valueOf(data.get(position).getAway().getGoalsAgainst());
        String tvCompetitionsIdLeagueTableRight_awayWins            = String.valueOf(data.get(position).getAway().getWins());
        String tvCompetitionsIdLeagueTableRight_awayDraws           = String.valueOf(data.get(position).getAway().getDraws());
        String tvCompetitionsIdLeagueTableRight_awayLosses          = String.valueOf(data.get(position).getAway().getLosses());

        holder.tvCompetitionsIdLeagueTableRight_teamName.setText(tvCompetitionsIdLeagueTableRight_teamName);
        holder.tvCompetitionsIdLeagueTableRight_position.setText(tvCompetitionsIdLeagueTableRight_position);
        holder.tvCompetitionsIdLeagueTableRight_playedGames.setText(tvCompetitionsIdLeagueTableRight_playedGames);
        holder.tvCompetitionsIdLeagueTableRight_points.setText(tvCompetitionsIdLeagueTableRight_points);
        holder.tvCompetitionsIdLeagueTableRight_goals.setText(tvCompetitionsIdLeagueTableRight_goals);
        holder.tvCompetitionsIdLeagueTableRight_goalsAgainst.setText(tvCompetitionsIdLeagueTableRight_goalsAgainst);
        holder.tvCompetitionsIdLeagueTableRight_goalDifference.setText(tvCompetitionsIdLeagueTableRight_goalDifference);
        holder.tvCompetitionsIdLeagueTableRight_wins.setText(tvCompetitionsIdLeagueTableRight_wins);
        holder.tvCompetitionsIdLeagueTableRight_draws.setText(tvCompetitionsIdLeagueTableRight_draws);
        holder.tvCompetitionsIdLeagueTableRight_losses.setText(tvCompetitionsIdLeagueTableRight_losses);
        holder.tvCompetitionsIdLeagueTableRight_homeGoals.setText(tvCompetitionsIdLeagueTableRight_homeGoals);
        holder.tvCompetitionsIdLeagueTableRight_homeGoalsAgainst.setText(tvCompetitionsIdLeagueTableRight_homeGoalsAgainst);
        holder.tvCompetitionsIdLeagueTableRight_homeWins.setText(tvCompetitionsIdLeagueTableRight_homeWins);
        holder.tvCompetitionsIdLeagueTableRight_homeDraws.setText(tvCompetitionsIdLeagueTableRight_homeDraws);
        holder.tvCompetitionsIdLeagueTableRight_homeLosses.setText(tvCompetitionsIdLeagueTableRight_homeLosses);
        holder.tvCompetitionsIdLeagueTableRight_awayGoals.setText(tvCompetitionsIdLeagueTableRight_awayGoals);
        holder.tvCompetitionsIdLeagueTableRight_awayGoalsAgainst.setText(tvCompetitionsIdLeagueTableRight_awayGoalsAgainst);
        holder.tvCompetitionsIdLeagueTableRight_awayWins.setText(tvCompetitionsIdLeagueTableRight_awayWins);
        holder.tvCompetitionsIdLeagueTableRight_awayDraws.setText(tvCompetitionsIdLeagueTableRight_awayDraws);
        holder.tvCompetitionsIdLeagueTableRight_awayLosses.setText(tvCompetitionsIdLeagueTableRight_awayLosses);




//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;
//        private TextView ;

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
