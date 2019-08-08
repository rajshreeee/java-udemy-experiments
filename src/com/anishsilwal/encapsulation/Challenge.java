package com.anishsilwal.encapsulation;

public class Challenge {

    public static void run() {
        Printer printer = new Printer("Laser Printer", true, 0, 10);

        if(!printer.print("Text")) {
            if (!printer.fillToner(100)) {
                printer.fillToner(50);
            }

            printer.print("Text");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Printer Model: " + printer.getModel());
        System.out.println("Number of pages printed: " + printer.getNumPages());
        System.out.println("Toner Level: " + printer.getTonerLevel());
        System.out.println("-------------------------------------------------");
    }

}
