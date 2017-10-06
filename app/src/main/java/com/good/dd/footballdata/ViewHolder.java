package com.good.dd.footballdata;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dds86 on 28.09.2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public View view;

    //UserCompetitions
    public TextView tvCompetitionsCaption;
    public TextView tvCompetitionsLastUpdated;

    //UserCompetitionsId
    public TextView tvCompetitionCaptionRight;
    public TextView tvCompetitionLeagueRight;
    public TextView tvCompetitionYearRight;
    public TextView tvCompetitionNumberOfTeamsRight;
    public TextView tvCompetitionCurrentMatchDayRight;
    public TextView tvCompetitionNumberOfMatchdaysRight;
    public TextView tvCompetitionLastUpdatedRight;
    public TextView tvCompetitionNumberOfGamesRight;

    //UserCompetitionsIdTeams
    public ImageView tvTeamCrestUrl;
    public TextView tvTeamName;

    //UserCompetitionsIdLeagueTable


    public TextView tvCompetitionsIdLeagueTable_teamName;
    public TextView tvCompetitionsIdLeagueTableRight_teamName;
    public TextView tvCompetitionsIdLeagueTable_position;
    public TextView tvCompetitionsIdLeagueTableRight_position;
    public TextView tvCompetitionsIdLeagueTable_playedGames;
    public TextView tvCompetitionsIdLeagueTableRight_playedGames;
    public TextView tvCompetitionsIdLeagueTable_points;
    public TextView tvCompetitionsIdLeagueTableRight_points;
    public TextView tvCompetitionsIdLeagueTable_goals;
    public TextView tvCompetitionsIdLeagueTableRight_goals;
    public TextView tvCompetitionsIdLeagueTable_goalsAgainst;
    public TextView tvCompetitionsIdLeagueTableRight_goalsAgainst;
    public TextView tvCompetitionsIdLeagueTable_goalDifference;
    public TextView tvCompetitionsIdLeagueTableRight_goalDifference;
    public TextView tvCompetitionsIdLeagueTable_wins;
    public TextView tvCompetitionsIdLeagueTableRight_wins;
    public TextView tvCompetitionsIdLeagueTable_draws;
    public TextView tvCompetitionsIdLeagueTableRight_draws;
    public TextView tvCompetitionsIdLeagueTable_losses;
    public TextView tvCompetitionsIdLeagueTableRight_losses;
    public TextView tvCompetitionsIdLeagueTable_homeGoals;
    public TextView tvCompetitionsIdLeagueTableRight_homeGoals;
    public TextView tvCompetitionsIdLeagueTable_homeGoalsAgainst;
    public TextView tvCompetitionsIdLeagueTableRight_homeGoalsAgainst;
    public TextView tvCompetitionsIdLeagueTable_homeWins;
    public TextView tvCompetitionsIdLeagueTableRight_homeWins;
    public TextView tvCompetitionsIdLeagueTable_homeDraws;
    public TextView tvCompetitionsIdLeagueTableRight_homeDraws;
    public TextView tvCompetitionsIdLeagueTable_homeLosses;
    public TextView tvCompetitionsIdLeagueTableRight_homeLosses;
    public TextView tvCompetitionsIdLeagueTable_awayGoals;
    public TextView tvCompetitionsIdLeagueTableRight_awayGoals;
    public TextView tvCompetitionsIdLeagueTable_awayGoalsAgainst;
    public TextView tvCompetitionsIdLeagueTableRight_awayGoalsAgainst;
    public TextView tvCompetitionsIdLeagueTable_awayWins;
    public TextView tvCompetitionsIdLeagueTableRight_awayWins;
    public TextView tvCompetitionsIdLeagueTable_awayDraws;
    public TextView tvCompetitionsIdLeagueTableRight_awayDraws;
    public TextView tvCompetitionsIdLeagueTable_awayLosses;
    public TextView tvCompetitionsIdLeagueTableRight_awayLosses;


    //UserCompetitionsIdFixtures
    public TextView tvCompetitionsIdFixturesRight_date;
    public TextView tvCompetitionsIdFixturesRight_status;
    public TextView tvCompetitionsIdFixturesRight_matchday;
    public TextView tvCompetitionsIdFixturesRight_homeTeamName;
    public TextView tvCompetitionsIdFixturesRight_awayTeamName;
    public TextView tvCompetitionsIdFixturesRight_goalsHomeTeam;
    public TextView tvCompetitionsIdFixturesRight_goalsAwayTeam;

    //UserTeamsIdPlayers
    public TextView mTvPlayerNameRight;
    public TextView mTvPlayerPositionRight;
    public TextView mTvPlayerJerseyNumberRight;
    public TextView mTvPlayerDateOfBirthRight;
    public TextView mTvPlayerNationalityRight;
    public TextView mTvPlayerContractUntilRight;
    public TextView mTvPlayerMarketValueRight;

    //UserFixtures
    public TextView tvFixturesRight_date;
    public TextView tvFixturesRight_status;
    public TextView tvFixturesRight_matchday;
    public TextView tvFixturesRight_homeTeamName;
    public TextView tvFixturesRight_awayTeamName;
    public TextView tvFixturesRight_odds;
    public TextView tvFixturesRight_goalsHomeTeam;
    public TextView tvFixturesRight_goalsAwayTeam;

    public ViewHolder(View itemView) {
        super(itemView);

        //UserCompetitions
        this.tvCompetitionsCaption = (TextView) itemView.findViewById(R.id.tvCompetitionsCaption);
        this.tvCompetitionsLastUpdated = (TextView) itemView.findViewById(R.id.tvCompetitionsLastUpdated);
        this.view = itemView;

        //UserCompetitionsId
        this.tvCompetitionCaptionRight = (TextView) view.findViewById(R.id.tvCompetitionsId_CaptionRight);
        this.tvCompetitionLeagueRight = (TextView) view.findViewById(R.id.tvCompetitionsId_LeagueRight);
        this.tvCompetitionYearRight = (TextView) view.findViewById(R.id.tvCompetitionsId_YearRight);
        this.tvCompetitionNumberOfTeamsRight = (TextView) view.findViewById(R.id.tvCompetitionsId_NumberOfTeamsRight);
        this.tvCompetitionCurrentMatchDayRight = (TextView) view.findViewById(R.id.tvCompetitionsId_CurrentMatchDayRight);
        this.tvCompetitionNumberOfMatchdaysRight = (TextView) view.findViewById(R.id.tvCompetitionsId_NumberOfMatchdaysRight);
        this.tvCompetitionLastUpdatedRight = (TextView) view.findViewById(R.id.tvCompetitionsId_LastUpdatedRight);
        this.tvCompetitionNumberOfGamesRight = (TextView) view.findViewById(R.id.tvCompetitionsId_NumberOfGamesRight);

        //UserCompetitionsIdTeams
        this.tvTeamCrestUrl = (ImageView) view.findViewById(R.id.tvTeamCrestUrl);
        this.tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);

        //UserCompetitionsIdLeagueTable
        this.tvCompetitionsIdLeagueTable_teamName = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_teamName);
        this.tvCompetitionsIdLeagueTableRight_teamName = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_teamName);
        this.tvCompetitionsIdLeagueTable_position = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_position);
        this.tvCompetitionsIdLeagueTableRight_position = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_position);
        this.tvCompetitionsIdLeagueTable_playedGames = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_playedGames);
        this.tvCompetitionsIdLeagueTableRight_playedGames = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_playedGames);
        this.tvCompetitionsIdLeagueTable_points = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_points);
        this.tvCompetitionsIdLeagueTableRight_points = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_points);
        this.tvCompetitionsIdLeagueTable_goals = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_goals);
        this.tvCompetitionsIdLeagueTableRight_goals = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_goals);
        this.tvCompetitionsIdLeagueTable_goalsAgainst = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_goalsAgainst);
        this.tvCompetitionsIdLeagueTableRight_goalsAgainst = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_goalsAgainst);
        this.tvCompetitionsIdLeagueTable_goalDifference = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_goalDifference);
        this.tvCompetitionsIdLeagueTableRight_goalDifference = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_goalDifference);
        this.tvCompetitionsIdLeagueTable_wins = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_wins);
        this.tvCompetitionsIdLeagueTableRight_wins = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_wins);
        this.tvCompetitionsIdLeagueTable_draws = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_draws);
        this.tvCompetitionsIdLeagueTableRight_draws = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_draws);
        this.tvCompetitionsIdLeagueTable_losses = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_losses);
        this.tvCompetitionsIdLeagueTableRight_losses = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_losses);
        this.tvCompetitionsIdLeagueTable_homeGoals = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_homeGoals);
        this.tvCompetitionsIdLeagueTableRight_homeGoals = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_homeGoals);
        this.tvCompetitionsIdLeagueTable_homeGoalsAgainst = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_homeGoalsAgainst);
        this.tvCompetitionsIdLeagueTableRight_homeGoalsAgainst = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_homeGoalsAgainst);
        this.tvCompetitionsIdLeagueTable_homeWins = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_homeWins);
        this.tvCompetitionsIdLeagueTableRight_homeWins = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_homeWins);
        this.tvCompetitionsIdLeagueTable_homeDraws = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_homeDraws);
        this.tvCompetitionsIdLeagueTableRight_homeDraws = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_homeDraws);
        this.tvCompetitionsIdLeagueTable_homeLosses = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_homeLosses);
        this.tvCompetitionsIdLeagueTableRight_homeLosses = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_homeLosses);
        this.tvCompetitionsIdLeagueTable_awayGoals = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_awayGoals);
        this.tvCompetitionsIdLeagueTableRight_awayGoals = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_awayGoals);
        this.tvCompetitionsIdLeagueTable_awayGoalsAgainst = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_awayGoalsAgainst);
        this.tvCompetitionsIdLeagueTableRight_awayGoalsAgainst = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_awayGoalsAgainst);
        this.tvCompetitionsIdLeagueTable_awayWins = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_awayWins);
        this.tvCompetitionsIdLeagueTableRight_awayWins = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_awayWins);
        this.tvCompetitionsIdLeagueTable_awayDraws = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_awayDraws);
        this.tvCompetitionsIdLeagueTableRight_awayDraws = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_awayDraws);
        this.tvCompetitionsIdLeagueTable_awayLosses = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTable_awayLosses);
        this.tvCompetitionsIdLeagueTableRight_awayLosses = (TextView) view.findViewById(R.id.tvCompetitionsIdLeagueTableRight_awayLosses);

        //UserCompetitionsIdFixtures
        this.tvCompetitionsIdFixturesRight_date = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_date);
        this.tvCompetitionsIdFixturesRight_status = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_status);
        this.tvCompetitionsIdFixturesRight_matchday = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_matchday);
        this.tvCompetitionsIdFixturesRight_homeTeamName = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_homeTeamName);
        this.tvCompetitionsIdFixturesRight_awayTeamName = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_awayTeamName);
        this.tvCompetitionsIdFixturesRight_goalsHomeTeam = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_goalsHomeTeam);
        this.tvCompetitionsIdFixturesRight_goalsAwayTeam = (TextView) view.findViewById(R.id.tvCompetitionsIdFixturesRight_goalsAwayTeam);

        //UserTeamsIdPlayers
        this.mTvPlayerNameRight = (TextView) view.findViewById(R.id.tvPlayerNameRight);
        this.mTvPlayerPositionRight = (TextView) view.findViewById(R.id.tvPlayerPositionRight);
        this.mTvPlayerJerseyNumberRight = (TextView) view.findViewById(R.id.tvPlayerJerseyNumberRight);
        this.mTvPlayerDateOfBirthRight = (TextView) view.findViewById(R.id.tvPlayerDateOfBirthRight);
        this.mTvPlayerNationalityRight = (TextView) view.findViewById(R.id.tvPlayerNationalityRight);
        this.mTvPlayerContractUntilRight = (TextView) view.findViewById(R.id.tvPlayerContractUntilRight);
        this.mTvPlayerMarketValueRight = (TextView) view.findViewById(R.id.tvPlayerMarketValueRight);

        //UserFixtures
        this.tvFixturesRight_date = (TextView) view.findViewById(R.id.tvFixturesRight_date);
        this.tvFixturesRight_status = (TextView) view.findViewById(R.id.tvFixturesRight_status);
        this.tvFixturesRight_matchday = (TextView) view.findViewById(R.id.tvFixturesRight_matchday);
        this.tvFixturesRight_homeTeamName = (TextView) view.findViewById(R.id.tvFixturesRight_homeTeamName);
        this.tvFixturesRight_awayTeamName = (TextView) view.findViewById(R.id.tvFixturesRight_awayTeamName);
        this.tvFixturesRight_odds = (TextView) view.findViewById(R.id.tvFixturesRight_odds);
        this.tvFixturesRight_goalsHomeTeam = (TextView) view.findViewById(R.id.tvFixturesRight_goalsHomeTeam);
        this.tvFixturesRight_goalsAwayTeam = (TextView) view.findViewById(R.id.tvFixturesRight_goalsAwayTeam);
    }



}
