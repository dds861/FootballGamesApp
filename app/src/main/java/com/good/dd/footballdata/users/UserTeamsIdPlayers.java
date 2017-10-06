package com.good.dd.footballdata.users;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dds86 on 01.10.2017.
 */

public class UserTeamsIdPlayers {

    @SerializedName("_links")
    private _links _links;
    @SerializedName("count")
    private int count;
    @SerializedName("players")
    private List<Players> players;

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
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

    public static class Players {
        @SerializedName("name")
        private String name;
        @SerializedName("position")
        private String position;
        @SerializedName("jerseyNumber")
        private int jerseyNumber;
        @SerializedName("dateOfBirth")
        private String dateOfBirth;
        @SerializedName("nationality")
        private String nationality;
        @SerializedName("contractUntil")
        private String contractUntil;
        @SerializedName("marketValue")
        private String marketValue;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getJerseyNumber() {
            return jerseyNumber;
        }

        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getContractUntil() {
            return contractUntil;
        }

        public void setContractUntil(String contractUntil) {
            this.contractUntil = contractUntil;
        }

        public String getMarketValue() {
            return marketValue;
        }

        public void setMarketValue(String marketValue) {
            this.marketValue = marketValue;
        }
    }
}
