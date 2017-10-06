package com.good.dd.footballdata.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dds86 on 02.10.2017.
 */

public class UserCompetitionsIdLeagueTable {


    @SerializedName("_links")
    private _links _links;
    @SerializedName("leagueCaption")
    private String leagueCaption;
    @SerializedName("matchday")
    private int matchday;
    @SerializedName("standing")
    private List<Standing> standing;

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public String getLeagueCaption() {
        return leagueCaption;
    }

    public void setLeagueCaption(String leagueCaption) {
        this.leagueCaption = leagueCaption;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public List<Standing> getStanding() {
        return standing;
    }

    public void setStanding(List<Standing> standing) {
        this.standing = standing;
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

    public static class _links {
        @SerializedName("self")
        private Self self;
        @SerializedName("competition")
        private Competition competition;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Competition getCompetition() {
            return competition;
        }

        public void setCompetition(Competition competition) {
            this.competition = competition;
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

    public static class Home {
        @SerializedName("goals")
        private int goals;
        @SerializedName("goalsAgainst")
        private int goalsAgainst;
        @SerializedName("wins")
        private int wins;
        @SerializedName("draws")
        private int draws;
        @SerializedName("losses")
        private int losses;

        public int getGoals() {
            return goals;
        }

        public void setGoals(int goals) {
            this.goals = goals;
        }

        public int getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(int goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

        public int getWins() {
            return wins;
        }

        public void setWins(int wins) {
            this.wins = wins;
        }

        public int getDraws() {
            return draws;
        }

        public void setDraws(int draws) {
            this.draws = draws;
        }

        public int getLosses() {
            return losses;
        }

        public void setLosses(int losses) {
            this.losses = losses;
        }
    }

    public static class Away {
        @SerializedName("goals")
        private int goals;
        @SerializedName("goalsAgainst")
        private int goalsAgainst;
        @SerializedName("wins")
        private int wins;
        @SerializedName("draws")
        private int draws;
        @SerializedName("losses")
        private int losses;

        public int getGoals() {
            return goals;
        }

        public void setGoals(int goals) {
            this.goals = goals;
        }

        public int getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(int goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

        public int getWins() {
            return wins;
        }

        public void setWins(int wins) {
            this.wins = wins;
        }

        public int getDraws() {
            return draws;
        }

        public void setDraws(int draws) {
            this.draws = draws;
        }

        public int getLosses() {
            return losses;
        }

        public void setLosses(int losses) {
            this.losses = losses;
        }
    }

    public static class Standing {
        @SerializedName("_links")
        private _links _links;
        @SerializedName("position")
        private int position;
        @SerializedName("teamName")
        private String teamName;
        @SerializedName("crestURI")
        private String crestURI;
        @SerializedName("playedGames")
        private int playedGames;
        @SerializedName("points")
        private int points;
        @SerializedName("goals")
        private int goals;
        @SerializedName("goalsAgainst")
        private int goalsAgainst;
        @SerializedName("goalDifference")
        private int goalDifference;
        @SerializedName("wins")
        private int wins;
        @SerializedName("draws")
        private int draws;
        @SerializedName("losses")
        private int losses;
        @SerializedName("home")
        private Home home;
        @SerializedName("away")
        private Away away;

        public _links get_links() {
            return _links;
        }

        public void set_links(_links _links) {
            this._links = _links;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getCrestURI() {
            return crestURI;
        }

        public void setCrestURI(String crestURI) {
            this.crestURI = crestURI;
        }

        public int getPlayedGames() {
            return playedGames;
        }

        public void setPlayedGames(int playedGames) {
            this.playedGames = playedGames;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public int getGoals() {
            return goals;
        }

        public void setGoals(int goals) {
            this.goals = goals;
        }

        public int getGoalsAgainst() {
            return goalsAgainst;
        }

        public void setGoalsAgainst(int goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
        }

        public int getGoalDifference() {
            return goalDifference;
        }

        public void setGoalDifference(int goalDifference) {
            this.goalDifference = goalDifference;
        }

        public int getWins() {
            return wins;
        }

        public void setWins(int wins) {
            this.wins = wins;
        }

        public int getDraws() {
            return draws;
        }

        public void setDraws(int draws) {
            this.draws = draws;
        }

        public int getLosses() {
            return losses;
        }

        public void setLosses(int losses) {
            this.losses = losses;
        }

        public Home getHome() {
            return home;
        }

        public void setHome(Home home) {
            this.home = home;
        }

        public Away getAway() {
            return away;
        }

        public void setAway(Away away) {
            this.away = away;
        }
    }
}
