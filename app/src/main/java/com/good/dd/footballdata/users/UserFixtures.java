package com.good.dd.footballdata.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dds86 on 02.10.2017.
 */

public class UserFixtures {


    @SerializedName("timeFrameStart")
    private String timeFrameStart;
    @SerializedName("timeFrameEnd")
    private String timeFrameEnd;
    @SerializedName("count")
    private int count;
    @SerializedName("fixtures")
    private List<Fixtures> fixtures;

    public String getTimeFrameStart() {
        return timeFrameStart;
    }

    public void setTimeFrameStart(String timeFrameStart) {
        this.timeFrameStart = timeFrameStart;
    }

    public String getTimeFrameEnd() {
        return timeFrameEnd;
    }

    public void setTimeFrameEnd(String timeFrameEnd) {
        this.timeFrameEnd = timeFrameEnd;
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

    public static class _links {
        @SerializedName("self")
        private Self self;
        @SerializedName("competition")
        private Competition competition;
        @SerializedName("homeTeam")
        private HomeTeam homeTeam;
        @SerializedName("awayTeam")
        private AwayTeam awayTeam;

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

        public HomeTeam getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(HomeTeam homeTeam) {
            this.homeTeam = homeTeam;
        }

        public AwayTeam getAwayTeam() {
            return awayTeam;
        }

        public void setAwayTeam(AwayTeam awayTeam) {
            this.awayTeam = awayTeam;
        }
    }

    public static class Result {
        @SerializedName("goalsHomeTeam")
        private String goalsHomeTeam;
        @SerializedName("goalsAwayTeam")
        private String goalsAwayTeam;

        public String getGoalsHomeTeam() {
            return goalsHomeTeam;
        }

        public void setGoalsHomeTeam(String goalsHomeTeam) {
            this.goalsHomeTeam = goalsHomeTeam;
        }

        public String getGoalsAwayTeam() {
            return goalsAwayTeam;
        }

        public void setGoalsAwayTeam(String goalsAwayTeam) {
            this.goalsAwayTeam = goalsAwayTeam;
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
