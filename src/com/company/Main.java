package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> footballTeam = new Team<>("footballTeam");
        Team<FootballPlayer> footballTeam2 = new Team<>("footballTeam2");
        Team<FootballPlayer> footballTeam3 = new Team<>("footballTeam3");

        footballLeague.add(footballTeam);
        footballLeague.add(footballTeam2);
        footballLeague.add(footballTeam3);


        footballTeam.matchResult(footballTeam2, 10, 2);
        footballTeam.matchResult(footballTeam3, 1, 2);

        footballLeague.showLeagueTable();

    }
}
