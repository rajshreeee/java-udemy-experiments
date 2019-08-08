package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GirlsTeam girlsTeam1 = new GirlsTeam("girlsTeam1", 20);
        GirlsTeam girlsTeam2 = new GirlsTeam("girlsTeam2", 20);

        BoysTeam boysTeam = new BoysTeam("boysTeam",10);

        League<GirlsTeam> girlsLeague= new League<>("Girls league");
        girlsLeague.addTeam(girlsTeam1);
        girlsLeague.addTeam(girlsTeam2);
        //girlsLeague.addTeam(boysTeam);
        girlsLeague.getTeamList();

    }
}
