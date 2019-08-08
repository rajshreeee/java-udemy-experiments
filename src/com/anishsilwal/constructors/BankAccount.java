package com.anishsilwal.constructors;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this("Default Name", "Default Email", "Default Phone","0000000", 0.0d);
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this(customerName, customerEmail, customerPhone, "0000000", 0.0d);
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone, String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.balance = balance;
    }

    public void showDetail() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Customer Phone: " + customerPhone);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: Rs." + balance);
        System.out.println("--------------------------------------------------------------");
    }

    public boolean deposit(double amount) {
        if(amount >= 0.0d) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if(amount >= 0.0d && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
