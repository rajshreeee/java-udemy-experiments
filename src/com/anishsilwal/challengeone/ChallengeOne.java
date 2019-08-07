package com.anishsilwal.challengeone;

public class ChallengeOne {

    public static void deposit(BankAccount account, double amount) {
        System.out.println("--------------------------------------------------------------");
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
        BankAccount account = new BankAccount();

        account.setCustomerName("Ram");
        account.setCustomerEmail("ram@domain.com");
        account.setCustomerPhone("9812321232");
        account.setAccountNumber(200);
        account.setBalance(400);

        account.showDetail();

        withdraw(account, 500);
        deposit(account, 200);
        withdraw(account, 500);
        deposit(account, -100);
        withdraw(account, -200);
    }

}
