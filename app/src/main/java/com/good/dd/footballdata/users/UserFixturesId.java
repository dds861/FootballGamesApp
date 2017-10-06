package com.good.dd.footballdata.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dds86 on 02.10.2017.
 */

public class UserFixturesId {


    @SerializedName("fixture")
    private Fixture fixture;
    @SerializedName("head2head")
    private Head2head head2head;

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Head2head getHead2head() {
        return head2head;
    }

    public void setHead2head(Head2head head2head) {
        this.head2head = head2head;
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

    public static class Fixture {
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

    public static class Odds {
        @SerializedName("homeWin")
        private double homeWin;
        @SerializedName("draw")
        private double draw;
        @SerializedName("awayWin")
        private double awayWin;

        public double getHomeWin() {
            return homeWin;
        }

        public void setHomeWin(double homeWin) {
            this.homeWin = homeWin;
        }

        public double getDraw() {
            return draw;
        }

        public void setDraw(double draw) {
            this.draw = draw;
        }

        public double getAwayWin() {
            return awayWin;
        }

        public void setAwayWin(double awayWin) {
            this.awayWin = awayWin;
        }
    }

    public static class LastHomeWinHomeTeam {
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
        private Odds odds;

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

        public Odds getOdds() {
            return odds;
        }

        public void setOdds(Odds odds) {
            this.odds = odds;
        }
    }

    public static class LastWinHomeTeam {
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
        private Odds odds;

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

        public Odds getOdds() {
            return odds;
        }

        public void setOdds(Odds odds) {
            this.odds = odds;
        }
    }

    public static class LastAwayWinAwayTeam {
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

    public static class LastWinAwayTeam {
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
        private Odds odds;

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

        public Odds getOdds() {
            return odds;
        }

        public void setOdds(Odds odds) {
            this.odds = odds;
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
        private Odds odds;

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

        public Odds getOdds() {
            return odds;
        }

        public void setOdds(Odds odds) {
            this.odds = odds;
        }
    }

    public static class Head2head {
        @SerializedName("count")
        private int count;
        @SerializedName("timeFrameStart")
        private String timeFrameStart;
        @SerializedName("timeFrameEnd")
        private String timeFrameEnd;
        @SerializedName("homeTeamWins")
        private int homeTeamWins;
        @SerializedName("awayTeamWins")
        private int awayTeamWins;
        @SerializedName("draws")
        private int draws;
        @SerializedName("lastHomeWinHomeTeam")
        private LastHomeWinHomeTeam lastHomeWinHomeTeam;
        @SerializedName("lastWinHomeTeam")
        private LastWinHomeTeam lastWinHomeTeam;
        @SerializedName("lastAwayWinAwayTeam")
        private LastAwayWinAwayTeam lastAwayWinAwayTeam;
        @SerializedName("lastWinAwayTeam")
        private LastWinAwayTeam lastWinAwayTeam;
        @SerializedName("fixtures")
        private List<Fixtures> fixtures;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

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

        public int getHomeTeamWins() {
            return homeTeamWins;
        }

        public void setHomeTeamWins(int homeTeamWins) {
            this.homeTeamWins = homeTeamWins;
        }

        public int getAwayTeamWins() {
            return awayTeamWins;
        }

        public void setAwayTeamWins(int awayTeamWins) {
            this.awayTeamWins = awayTeamWins;
        }

        public int getDraws() {
            return draws;
        }

        public void setDraws(int draws) {
            this.draws = draws;
        }

        public LastHomeWinHomeTeam getLastHomeWinHomeTeam() {
            return lastHomeWinHomeTeam;
        }

        public void setLastHomeWinHomeTeam(LastHomeWinHomeTeam lastHomeWinHomeTeam) {
            this.lastHomeWinHomeTeam = lastHomeWinHomeTeam;
        }

        public LastWinHomeTeam getLastWinHomeTeam() {
            return lastWinHomeTeam;
        }

        public void setLastWinHomeTeam(LastWinHomeTeam lastWinHomeTeam) {
            this.lastWinHomeTeam = lastWinHomeTeam;
        }

        public LastAwayWinAwayTeam getLastAwayWinAwayTeam() {
            return lastAwayWinAwayTeam;
        }

        public void setLastAwayWinAwayTeam(LastAwayWinAwayTeam lastAwayWinAwayTeam) {
            this.lastAwayWinAwayTeam = lastAwayWinAwayTeam;
        }

        public LastWinAwayTeam getLastWinAwayTeam() {
            return lastWinAwayTeam;
        }

        public void setLastWinAwayTeam(LastWinAwayTeam lastWinAwayTeam) {
            this.lastWinAwayTeam = lastWinAwayTeam;
        }

        public List<Fixtures> getFixtures() {
            return fixtures;
        }

        public void setFixtures(List<Fixtures> fixtures) {
            this.fixtures = fixtures;
        }
    }
}
