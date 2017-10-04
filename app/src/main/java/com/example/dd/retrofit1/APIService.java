package com.example.dd.retrofit1;

import com.example.dd.retrofit1.users.UserCompetitions;
import com.example.dd.retrofit1.users.UserCompetitionsId;
import com.example.dd.retrofit1.users.UserCompetitionsIdFixtures;
import com.example.dd.retrofit1.users.UserCompetitionsIdLeagueTable;
import com.example.dd.retrofit1.users.UserCompetitionsIdTeams;
import com.example.dd.retrofit1.users.UserFixtures;
import com.example.dd.retrofit1.users.UserFixturesId;
import com.example.dd.retrofit1.users.UserTeamsId;
import com.example.dd.retrofit1.users.UserTeamsIdFixtures;
import com.example.dd.retrofit1.users.UserTeamsIdPlayers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

    /**
      Competition   - List all available competitions.                  http://api.football-data.org/v1/competitions/                   season=/\d\d\d\d/
      Team          - List all teams for a certain competition.         http://api.football-data.org/v1/competitions/{id}/teams
      LeagueTable   - Show League Table / current standing.             http://api.football-data.org/v1/competitions/{id}/leagueTable   matchday=/\d+/
      Fixture1      - List all fixtures for a certain competition.      http://api.football-data.org/v1/competitions/{id}/fixtures      timeFrame=/p|n[1-9]{1,2}/matchday=/\d+/
      Fixture2	    - List fixtures across a set of competitions.       http://api.football-data.org/v1/fixtures/                       timeFrame=/p|n[1-9]{1,2}/league=leagueCode
      Fixture3	    - Show one fixture.                                 http://api.football-data.org/v1/fixtures/{id}                   head2head=/\d+/
      Fixture4	    - Show all fixtures for a certain team.             http://api.football-data.org/v1/teams/{id}/fixtures/            season=/\d\d\d\d/timeFrame=/p|n[1-9]{1,2}/venue=/home|away/
      Team          - Show one team.                                    http://api.football-data.org/v1/teams/{id}
      Player        - Show all players for a certain team.              http://api.football-data.org/v1/teams/{id}/players

     */

public interface APIService {

    //Competitions          - List all available competitions.                                  season=/\d\d\d\d/
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/competitions")
    Call<List<UserCompetitions>>        getApiCompetitions();

    //Competition           - Show one Competition.
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/competitions/{id}")
    Call<UserCompetitionsId>            getApiCompetitionsId            (@Path("id") int id);

    //Teams                 - List all teams for a certain competition.
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/competitions/{id}/teams")
    Call<UserCompetitionsIdTeams>       getApiCompetitionsIdTeams       (@Path("id") int id);

    //LeagueTable           - Show League Table / current standing.                             matchday=/\d+/
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/competitions/{id}/leagueTable")
    Call<UserCompetitionsIdLeagueTable> getApiCompetitionsIdLeagueTable (@Path("id") int id);

    //FixtureCompetition    - List all fixtures for a certain competition.                      timeFrame=/p|n[1-9]{1,2}/matchday=/\d+/
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/competitions/{id}/fixtures")
    Call<UserCompetitionsIdFixtures>    getApiCompetitionsIdFixtures    (@Path("id") int id);

    //FixtureCompetitions   - List fixtures across a set of competitions.                       timeFrame=/p|n[1-9]{1,2}/league=leagueCode
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/fixtures")
    Call<UserFixtures>                  getApiFixtures                  (@Path("id") int id);

    //Fixture	            - Show one fixture.                                                 head2head=/\d+/
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/fixtures/{id}")
    Call<UserFixturesId>                getApiFixturesId                (@Path("id") int id);

    //FixtureTeam	        - Show all fixtures for a certain team.                             season=/\d\d\d\d/timeFrame=/p|n[1-9]{1,2}/venue=/home|away/
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/teams/{id}/fixtures")
    Call<UserTeamsIdFixtures>           getApiTeamsIdFixtures           (@Path("id") int id);

    //Team                  - Show one team.
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/teams/{id}")
    Call<UserTeamsId>                   getApiTeamsId                   (@Path("id") int id);

    //Players               - Show all players for a certain team.
    @Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
    @GET("v1/teams/{id}/players")
    Call<UserTeamsIdPlayers>            getApiTeamsIdPlayers            (@Path("id") int id);




}
