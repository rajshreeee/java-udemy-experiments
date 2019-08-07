package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex){
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fillAmount){
        tonerLevel+= fillAmount;
        if(tonerLevel>=100){
            tonerLevel = 100;
        }
    }

    public  void printPages(int pages){
        numberOfPages+=pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
