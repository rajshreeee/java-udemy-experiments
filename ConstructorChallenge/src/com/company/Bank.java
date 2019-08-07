package com.company;

public class Bank {
    private long accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String  phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(int depositAmount){
        balance+=depositAmount;
    }

    public void withdrawMoney(int withdrawAmount){
        if(balance-withdrawAmount<0){
            System.out.println("Insufficient Funds");
        }else{
            balance -=withdrawAmount;
        }

    }

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank();
        bank.setAccountNumber(123456789);
        bank.setBalance(200);
        bank.setEmail("rajshreerai@lftechnology.com");
        bank.setPhoneNumber("9803922453");
        bank.depositMoney(100);
        System.out.println("Current Balance"+bank.balance);
        bank.withdrawMoney(500);
        System.out.println("Current Balance"+bank.balance);

    }
}
