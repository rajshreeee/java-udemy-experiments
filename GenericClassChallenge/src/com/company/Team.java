package com.company;

public class Team {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void  getInfo(){
        System.out.println("Score of team: "+ score);
        System.out.println("Name of team: "+name);
    }
}
