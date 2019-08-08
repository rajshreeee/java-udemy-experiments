public class Main {
    public static void main(String [] args){
        String accountNumber="140BACF34G";
        BankAccounts dinanksAccount=new BankAccounts();
        dinanksAccount.setAccountNumber(accountNumber);
        dinanksAccount.setAccountBalance(45000.0);
        dinanksAccount.getAccountBalance();

        dinanksAccount.depositFunds(1500.0);
        dinanksAccount.withdrawFunds(200.0);

    }
}
