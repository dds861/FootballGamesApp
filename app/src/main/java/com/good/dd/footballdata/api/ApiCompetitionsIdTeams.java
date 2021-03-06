package com.good.dd.footballdata.api;

import com.good.dd.footballdata.users.UserCompetitionsIdTeams;

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

public interface ApiCompetitionsIdTeams {


//Teams                 - List all teams for a certain competition.
@Headers("X-Auth-Token: 51c2f3735f6d4b759288f34cee754d31")
@GET("v1/competitions/{id}/teams")
Call<UserCompetitionsIdTeams>       getApiCompetitionsIdTeams(@Path("id") int id);




}
