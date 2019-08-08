package com.company;

import java.util.ArrayList;

public class League<T extends  Team> {

    private ArrayList<T> teamList = new ArrayList<>();

    private String name;

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team){
        teamList.add(team);
    }

    public void getTeamList(){
        System.out.println(teamList);
    }
}
