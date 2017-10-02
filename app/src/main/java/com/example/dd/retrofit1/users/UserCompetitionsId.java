package com.example.dd.retrofit1.users;

import com.google.gson.annotations.SerializedName;


public class UserCompetitionsId {


    @SerializedName("_links")
    private _links _links;
    @SerializedName("id")
    private int id;
    @SerializedName("caption")
    private String caption;
    @SerializedName("league")
    private String league;
    @SerializedName("year")
    private String year;
    @SerializedName("currentMatchday")
    private int currentMatchday;
    @SerializedName("numberOfMatchdays")
    private int numberOfMatchdays;
    @SerializedName("numberOfTeams")
    private int numberOfTeams;
    @SerializedName("numberOfGames")
    private int numberOfGames;
    @SerializedName("lastUpdated")
    private String lastUpdated;

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(int currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    public int getNumberOfMatchdays() {
        return numberOfMatchdays;
    }

    public void setNumberOfMatchdays(int numberOfMatchdays) {
        this.numberOfMatchdays = numberOfMatchdays;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
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

    public static class Teams {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class Fixtures {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class LeagueTable {
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
        @SerializedName("teams")
        private Teams teams;
        @SerializedName("fixtures")
        private Fixtures fixtures;
        @SerializedName("leagueTable")
        private LeagueTable leagueTable;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Teams getTeams() {
            return teams;
        }

        public void setTeams(Teams teams) {
            this.teams = teams;
        }

        public Fixtures getFixtures() {
            return fixtures;
        }

        public void setFixtures(Fixtures fixtures) {
            this.fixtures = fixtures;
        }

        public LeagueTable getLeagueTable() {
            return leagueTable;
        }

        public void setLeagueTable(LeagueTable leagueTable) {
            this.leagueTable = leagueTable;
        }
    }
}
