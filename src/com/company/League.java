package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;

    // An array list that will contain the teams
    private ArrayList<T> league = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            return false;
        }

        league.add(team);
        return true;
    }


    public void showLeagueTable(){

        Collections.sort(league);

        // loop through the league and display each team in order
        for(T t: league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }




}
