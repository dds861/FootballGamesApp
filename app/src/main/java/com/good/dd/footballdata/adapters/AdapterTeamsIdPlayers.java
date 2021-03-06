package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.users.UserTeamsIdPlayers;

import java.util.ArrayList;


/**
 * Created by dds86 on 30.09.2017.
 */

public class AdapterTeamsIdPlayers extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<UserTeamsIdPlayers.Players> players;
    private int idItemClicked;

    public AdapterTeamsIdPlayers(Context context, ArrayList<UserTeamsIdPlayers.Players> players, int idItemClicked) {
        this.context = context;
        this.players = players;
        this.idItemClicked = idItemClicked;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_teams_id_players, parent, false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String mTvPlayerNameRight = players.get(position).getName();
        String mTvPlayerPositionRight = players.get(position).getPosition();
        String mTvPlayerJerseyNumberRight = String.valueOf(players.get(position).getJerseyNumber());
        String mTvPlayerDateOfBirthRight = players.get(position).getDateOfBirth();
        String mTvPlayerNationalityRight = players.get(position).getNationality();
        String mTvPlayerContractUntilRight = players.get(position).getContractUntil();
        String mTvPlayerMarketValueRight = players.get(position).getMarketValue();

        holder.mTvPlayerNameRight.setText(mTvPlayerNameRight);
        holder.mTvPlayerPositionRight.setText(mTvPlayerPositionRight);
        holder.mTvPlayerJerseyNumberRight.setText(mTvPlayerJerseyNumberRight);
        holder.mTvPlayerDateOfBirthRight.setText(mTvPlayerDateOfBirthRight);
        holder.mTvPlayerNationalityRight.setText(mTvPlayerNationalityRight);
        holder.mTvPlayerContractUntilRight.setText(mTvPlayerContractUntilRight);
        holder.mTvPlayerMarketValueRight.setText(mTvPlayerMarketValueRight);


    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
