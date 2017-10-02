package com.example.dd.retrofit1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dds86 on 28.09.2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public View view;

    //Competitions
    public TextView tvCompetitionsCaption;
    public TextView tvCompetitionsLastUpdated;

    //Competition
    public TextView tvCompetitionCaptionRight;
    public TextView tvCompetitionLeagueRight;
    public TextView tvCompetitionYearRight;
    public TextView tvCompetitionNumberOfTeamsRight;
    public TextView tvCompetitionCurrentMatchDayRight;
    public TextView tvCompetitionNumberOfMatchdaysRight;
    public TextView tvCompetitionLastUpdatedRight;
    public TextView tvCompetitionNumberOfGamesRight;

    //Teams
    public ImageView tvTeamCrestUrl;
    public TextView tvTeamName;

    //Players
    public TextView mTvPlayerNameRight;
    public TextView mTvPlayerPositionRight;
    public TextView mTvPlayerJerseyNumberRight;
    public TextView mTvPlayerDateOfBirthRight;
    public TextView mTvPlayerNationalityRight;
    public TextView mTvPlayerContractUntilRight;
    public TextView mTvPlayerMarketValueRight;

    public ViewHolder(View itemView) {
        super(itemView);

        //Competitions
        this.tvCompetitionsCaption = (TextView) itemView.findViewById(R.id.tvCompetitionsCaption);
        this.tvCompetitionsLastUpdated = (TextView) itemView.findViewById(R.id.tvCompetitionsLastUpdated);
        this.view = itemView;

        //Competition
        this.tvCompetitionCaptionRight = (TextView) view.findViewById(R.id.tvCompetitionCaptionRight);
        this.tvCompetitionLeagueRight = (TextView) view.findViewById(R.id.tvCompetitionLeagueRight);
        this.tvCompetitionYearRight = (TextView) view.findViewById(R.id.tvCompetitionYearRight);
        this.tvCompetitionNumberOfTeamsRight = (TextView) view.findViewById(R.id.tvCompetitionNumberOfTeamsRight);
        this.tvCompetitionCurrentMatchDayRight = (TextView) view.findViewById(R.id.tvCompetitionCurrentMatchDayRight);
        this.tvCompetitionNumberOfMatchdaysRight = (TextView) view.findViewById(R.id.tvCompetitionNumberOfMatchdaysRight);
        this.tvCompetitionLastUpdatedRight = (TextView) view.findViewById(R.id.tvCompetitionLastUpdatedRight);
        this.tvCompetitionNumberOfGamesRight = (TextView) view.findViewById(R.id.tvCompetitionNumberOfGamesRight);

        //Teams
        this.tvTeamCrestUrl = (ImageView) view.findViewById(R.id.tvTeamCrestUrl);
        this.tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);

        //Players
        this.mTvPlayerNameRight = (TextView) view.findViewById(R.id.tvPlayerNameRight);
        this.mTvPlayerPositionRight = (TextView) view.findViewById(R.id.tvPlayerPositionRight);
        this.mTvPlayerJerseyNumberRight = (TextView) view.findViewById(R.id.tvPlayerJerseyNumberRight);
        this.mTvPlayerDateOfBirthRight = (TextView) view.findViewById(R.id.tvPlayerDateOfBirthRight);
        this.mTvPlayerNationalityRight = (TextView) view.findViewById(R.id.tvPlayerNationalityRight);
        this.mTvPlayerContractUntilRight = (TextView) view.findViewById(R.id.tvPlayerContractUntilRight);
        this.mTvPlayerMarketValueRight = (TextView) view.findViewById(R.id.tvPlayerMarketValueRight);

    }


}
