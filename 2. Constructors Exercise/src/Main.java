public class Main {
    public static  void  main(String[] args){
        VipCustomer customer1=new VipCustomer();
        System.out.println(customer1.getName()+customer1.getEmailAddess()+customer1.getCreditLimit());
        VipCustomer customer2=new VipCustomer("Anish Silwal","anish_silwal@gmail.com");
        System.out.println(customer2.getName()+customer2.getEmailAddess()+customer2.getCreditLimit());
        VipCustomer customer3=new VipCustomer("Dipendra Shrestha", 4000.0, "xyz@gmail.com");
        System.out.println(customer3.getName()+customer3.getEmailAddess()+customer3.getCreditLimit());
    }
}
