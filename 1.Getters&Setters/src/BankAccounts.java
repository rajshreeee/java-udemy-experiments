public class BankAccounts {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEMailAddress;
    private String phoneNumber;

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerEMailAddress(){
        return this.customerEMailAddress;
    }
    public void setCustomerEMailAddress(String customerEMailAddress){
        this.customerEMailAddress=customerEMailAddress;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void depositFunds(double balance){
        this.accountBalance+= balance;
        System.out.println(balance+"deposited into account number: "+this.accountNumber);
    }
    public void withdrawFunds(double balance){
        if ((this.accountBalance-balance)<0){
            this.accountBalance-=balance;
            System.out.println(balance+"has been withdrawn from account number: "+this.accountNumber);
        }
    }
}

