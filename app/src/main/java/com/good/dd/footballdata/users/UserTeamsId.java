package com.good.dd.footballdata.users;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dds86 on 02.10.2017.
 */

public class UserTeamsId {


    @SerializedName("_links")
    private _links _links;
    @SerializedName("name")
    private String name;
    @SerializedName("code")
    private String code;
    @SerializedName("shortName")
    private String shortName;
    @SerializedName("squadMarketValue")
    private String squadMarketValue;
    @SerializedName("crestUrl")
    private String crestUrl;

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSquadMarketValue() {
        return squadMarketValue;
    }

    public void setSquadMarketValue(String squadMarketValue) {
        this.squadMarketValue = squadMarketValue;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

    public void setCrestUrl(String crestUrl) {
        this.crestUrl = crestUrl;
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

    public static class Players {
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
        @SerializedName("fixtures")
        private Fixtures fixtures;
        @SerializedName("players")
        private Players players;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Fixtures getFixtures() {
            return fixtures;
        }

        public void setFixtures(Fixtures fixtures) {
            this.fixtures = fixtures;
        }

        public Players getPlayers() {
            return players;
        }

        public void setPlayers(Players players) {
            this.players = players;
        }
    }
}
