package com.anishsilwal.constructors;

public class Challenge {

    public static void deposit(BankAccount account, double amount) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Account Number: " + account.getAccountNumber());
        if(account.deposit(amount)){
            System.out.println("Deposited Amount: Rs. " + amount);
        }else{
            System.out.println("Cannot deposit the amount specified.");
            System.out.println("Amount Specified: Rs. " + amount);
        }
        System.out.println("New Account Balance: Rs." + account.getBalance());
        System.out.println("--------------------------------------------------------------");
    }

    public static void withdraw(BankAccount account, double amount){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Account Number: " + account.getAccountNumber());
        if(account.withdraw(amount)){
            System.out.println("Amount Withdrawn: " + amount);
        }else{
            if(amount < 0){
                System.out.println("Cannot deposit the amount specified.");
            }else {
                System.out.println("Insufficient amount in the balance.");
            }
            System.out.println("Balance: Rs. " + account.getBalance());
            System.out.println("Amount Specified: Rs. " + amount);
        }

        System.out.println("New Account Balance: Rs." + account.getBalance());
        System.out.println("--------------------------------------------------------------");
    }

    public static void run () {
        BankAccount ramAccount = new BankAccount();
        ramAccount.setCustomerName("Ram");
        ramAccount.setCustomerEmail("ram@domain.com");
        ramAccount.setCustomerPhone("9812321232");
        ramAccount.setAccountNumber("223123");
        ramAccount.setBalance(400);

        BankAccount samAccount = new BankAccount("Sam", "sam@domain.com", "9812312311", "231232", 0);

        ramAccount.showDetail();
        samAccount.showDetail();

        withdraw(ramAccount, 500);
        deposit(ramAccount, 200);
        withdraw(ramAccount, 500);
        deposit(samAccount, -100);
        withdraw(samAccount, -200);

        VipAccount defaultVipAcc = new VipAccount();
        VipAccount hariAcc = new VipAccount("Hari", 2000.0d);
        VipAccount sitaAcc = new VipAccount("Sita", 50000.0d, "sita@domain.com");

        defaultVipAcc.showDetails();
        hariAcc.showDetails();
        sitaAcc.showDetails();

    }

}
