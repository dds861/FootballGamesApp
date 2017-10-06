package com.good.dd.footballdata.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dds86 on 02.10.2017.
 */

public class UserTeamsIdFixtures {


    @SerializedName("_links")
    private _links _links;
    @SerializedName("season")
    private String season;
    @SerializedName("count")
    private int count;
    @SerializedName("fixtures")
    private List<Fixtures> fixtures;

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Fixtures> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixtures> fixtures) {
        this.fixtures = fixtures;
    }

    public static class Self {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class Team {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class _links {
        @SerializedName("self")
        private Self self;
        @SerializedName("team")
        private Team team;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Team getTeam() {
            return team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }
    }

    public static class Competition {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class HomeTeam {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class AwayTeam {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class HalfTime {
        @SerializedName("goalsHomeTeam")
        private int goalsHomeTeam;
        @SerializedName("goalsAwayTeam")
        private int goalsAwayTeam;

        public int getGoalsHomeTeam() {
            return goalsHomeTeam;
        }

        public void setGoalsHomeTeam(int goalsHomeTeam) {
            this.goalsHomeTeam = goalsHomeTeam;
        }

        public int getGoalsAwayTeam() {
            return goalsAwayTeam;
        }

        public void setGoalsAwayTeam(int goalsAwayTeam) {
            this.goalsAwayTeam = goalsAwayTeam;
        }
    }

    public static class Result {
        @SerializedName("goalsHomeTeam")
        private int goalsHomeTeam;
        @SerializedName("goalsAwayTeam")
        private int goalsAwayTeam;
        @SerializedName("halfTime")
        private HalfTime halfTime;

        public int getGoalsHomeTeam() {
            return goalsHomeTeam;
        }

        public void setGoalsHomeTeam(int goalsHomeTeam) {
            this.goalsHomeTeam = goalsHomeTeam;
        }

        public int getGoalsAwayTeam() {
            return goalsAwayTeam;
        }

        public void setGoalsAwayTeam(int goalsAwayTeam) {
            this.goalsAwayTeam = goalsAwayTeam;
        }

        public HalfTime getHalfTime() {
            return halfTime;
        }

        public void setHalfTime(HalfTime halfTime) {
            this.halfTime = halfTime;
        }
    }

    public static class Fixtures {
        @SerializedName("_links")
        private _links _links;
        @SerializedName("date")
        private String date;
        @SerializedName("status")
        private String status;
        @SerializedName("matchday")
        private int matchday;
        @SerializedName("homeTeamName")
        private String homeTeamName;
        @SerializedName("awayTeamName")
        private String awayTeamName;
        @SerializedName("result")
        private Result result;
        @SerializedName("odds")
        private String odds;

        public _links get_links() {
            return _links;
        }

        public void set_links(_links _links) {
            this._links = _links;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getMatchday() {
            return matchday;
        }

        public void setMatchday(int matchday) {
            this.matchday = matchday;
        }

        public String getHomeTeamName() {
            return homeTeamName;
        }

        public void setHomeTeamName(String homeTeamName) {
            this.homeTeamName = homeTeamName;
        }

        public String getAwayTeamName() {
            return awayTeamName;
        }

        public void setAwayTeamName(String awayTeamName) {
            this.awayTeamName = awayTeamName;
        }

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public String getOdds() {
            return odds;
        }

        public void setOdds(String odds) {
            this.odds = odds;
        }
    }
}
