package com.example.dd.retrofit1.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dd.retrofit1.R;
import com.example.dd.retrofit1.ViewHolder;
import com.example.dd.retrofit1.competitions.ActivityCompetitions;
import com.example.dd.retrofit1.users.UserCompetitions;

import java.util.List;

/**
 * Created by dd on 03.05.2017.
 */

public class AdapterCompetitions extends RecyclerView.Adapter<ViewHolder> {

    private List<UserCompetitions> data;
    Context context;


    public AdapterCompetitions(Context context, List<UserCompetitions> data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_competitions, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        String caption = data.get(position).getCaption();
        String lastupdated = data.get(position).getLastupdated();

        holder.tvCompetitionsCaption.setText(caption);
        holder.tvCompetitionsLastUpdated.setText(lastupdated);



        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, ActivityCompetitions.class);
                intent.putExtra("openActivity", 1);
                intent.putExtra("idCompetitionClicked", data.get(position).getId());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
