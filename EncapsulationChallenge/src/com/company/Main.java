package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(20,2,false);
        printer.fillToner(50);
        printer.printPages(4);
        System.out.println(printer.getNumberOfPages());
        System.out.println(printer.getTonerLevel());
    }
}
