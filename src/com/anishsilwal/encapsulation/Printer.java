package com.anishsilwal.encapsulation;

public class Printer {

    private static final float MAX_TONER_LEVEL = 100;
    private static final float TONER_PER_PAGE = 10;

    protected String model;
    private int numPages;
    private float tonerLevel;
    private boolean duplex;

    public Printer() {
        this("Default Model");
    }

    public Printer(String model) {
        this(model, false);
    }

    public Printer(String model, boolean duplex) {
        this(model, duplex, 0, MAX_TONER_LEVEL);
    }

    public Printer(String model, boolean duplex, int numPages, float tonerLevel) {
        this.model = model;
        this.duplex = duplex;
        this.numPages = numPages;
        this.tonerLevel = tonerLevel;
    }

    public boolean fillToner(float level) {
        System.out.println("-------------------------------------------------");
        if(level < 0) {
            System.out.println("Invalid Toner level(" + level + ")");
            return false;
        }else if ((tonerLevel + level) > MAX_TONER_LEVEL){
            System.out.println("Cannot fill toner above the MAX level(" + MAX_TONER_LEVEL + ")");
            System.out.println("Invalid Toner level(" + (tonerLevel + level) + ")");
            return false;
        }

        System.out.println("Filling Toner");
        tonerLevel += level;
        System.out.println("New Toner Level: " + tonerLevel);
        System.out.println("-------------------------------------------------");

        return true;
    }

    public boolean print(String text) {
        System.out.println("-------------------------------------------------");
        if(duplex){
            System.out.println("Printing On Both Sides.");
        }

        if(tonerLevel < TONER_PER_PAGE || (duplex && tonerLevel < 2 * TONER_PER_PAGE)){
            System.out.println("Low Toner Level. Cannot print.");
            System.out.println("Current Toner Level: " + tonerLevel);
            System.out.println("Required Toner Level: " + ((duplex) ? (2 * TONER_PER_PAGE) : TONER_PER_PAGE));
            return false;
        }

        System.out.println("Printed: " + text);

        if(duplex){
            numPages += 2;
            tonerLevel -= 2 * TONER_PER_PAGE;
        }else{
            numPages += 1;
            tonerLevel -= TONER_PER_PAGE;
        }
        System.out.println("-------------------------------------------------");

        return true;
    }

    public float getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getModel() {
        return model;
    }
}
