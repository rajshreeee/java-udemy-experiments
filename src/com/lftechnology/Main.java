package com.lftechnology;

public class Main {

    public static void main(String[] args) {
	    accountDriver();
	    vipCustomerDriver();
    }

    public static void accountDriver() {
        Account dipusAccount = new Account("015-3245-4563",
                500, "Dipu",
                "dipu@mail.com",
                "9813629353");

        System.out.println("Old balance: " + dipusAccount.getBalance());

        dipusAccount.withdrawFund(700);
        dipusAccount.depositFund(500);
        dipusAccount.withdrawFund(700);

        System.out.println("New balance: " + dipusAccount.getBalance());
    }

    public static void vipCustomerDriver() {
        VipCustomer defaultVipCustomer = new VipCustomer();
        VipCustomer ram = new VipCustomer("Ram", 10000);
        VipCustomer hari = new VipCustomer("Hari", 15000, "hari@mail.com");

        System.out.println("\nName: " + defaultVipCustomer.getName() +
                "\nCredit Limit: " + defaultVipCustomer.getCreditLimit() +
                "\nEmail Address: " + defaultVipCustomer.getEmail()
        );

        System.out.println("\nName: " + ram.getName() +
                "\nCredit Limit: " + ram.getCreditLimit() +
                "\nEmail Address: " + ram.getEmail()
        );

        System.out.println("\nName: " + hari.getName() +
                "\nCredit Limit: " + hari.getCreditLimit() +
                "\nEmail Address: " + hari.getEmail()
        );
    }
}
