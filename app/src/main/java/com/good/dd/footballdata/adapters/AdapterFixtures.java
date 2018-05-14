package com.good.dd.footballdata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.good.dd.footballdata.R;
import com.good.dd.footballdata.ViewHolder;
import com.good.dd.footballdata.users.UserFixtures;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


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

        holder.tvFixturesRight_date.setText(dateConverter(tvFixturesRight_date));


        if (tvFixturesRight_status.equals("TIMED")) {
            holder.tvFixturesRight_status.setVisibility(View.GONE);
        } else if (tvFixturesRight_status.equals("IN_PLAY")) {
            holder.tvFixturesRight_status.setText("Playing Now");
        } else if (tvFixturesRight_status.equals("FINISHED")) {
            holder.tvFixturesRight_status.setText("Finished");
        } else {
            holder.tvFixturesRight_status.setText(tvFixturesRight_status);

        }
//        holder.tvFixturesRight_matchday.setText(tvFixturesRight_matchday);
        holder.tvFixturesRight_homeTeamName.setText(tvFixturesRight_homeTeamName);
        holder.tvFixturesRight_awayTeamName.setText(tvFixturesRight_awayTeamName);
//        holder.tvFixturesRight_odds.setText(tvFixturesRight_odds);

        //Если счет null тогда не показывать счет
        if (tvFixturesRight_goalsHomeTeam != "null" && tvFixturesRight_goalsAwayTeam != "null") {
            holder.tvFixturesRight_goalsHomeTeam.setText(tvFixturesRight_goalsHomeTeam);
            holder.tvFixturesRight_goalsAwayTeam.setText(tvFixturesRight_goalsAwayTeam);
        } else {
            holder.tvFixturesRight_goalsHomeTeam.setVisibility(View.GONE);
            holder.tvFixturesRight_goalsAwayTeam.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    private String dateConverter(String dateStr) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
//        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.ENGLISH);
        df.setTimeZone(TimeZone.getDefault());
        Date date = null;
        try {
            date = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // output format: hour:minute AM/PM
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM HH:mm", Locale.ENGLISH);
// assuming a timezone in India
        outputFormat.setTimeZone(TimeZone.getDefault());
//        outputFormat.setTimeZone(TimeZone.getDefault());


//        df.setTimeZone(TimeZone.getDefault());
//        String formattedDate = df.format(date);
//        Log.i("autolog", "formattedDate: " + formattedDate);
        return outputFormat.format(date);
    }


    private String getCurrentTimeZone() {
        Calendar cal = Calendar.getInstance();
        long milliDiff = cal.get(Calendar.ZONE_OFFSET);
// Got local offset, now loop through available timezone id(s).
        String[] ids = TimeZone.getAvailableIDs();
        String name = null;
        for (String id : ids) {
            TimeZone tz = TimeZone.getTimeZone(id);
            if (tz.getRawOffset() == milliDiff) {
                // Found a match.
                name = id;
                break;
            }
        }
        Log.i("autolog", "name: " + name);
        return name;
    }

}
