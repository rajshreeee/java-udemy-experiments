package com.anishsilwal.challengeone;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void showDetail() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Customer Phone: " + customerPhone);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: Rs." + balance);
    }

    public boolean deposit(double amount) {
        if(amount >= 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if(amount >= 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
