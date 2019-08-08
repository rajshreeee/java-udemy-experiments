public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddess;
 public VipCustomer(){
     // WE CAN DO THIS TOO:=> this("Dinank",4000.0,"bista.dinank@xyz.com");
     this.name="Dinank";
     this.creditLimit=4000.0;
     this.emailAddess="bista.dinank@xyz.com";
 }

    public VipCustomer(String name, String emailAddess) {
     //WE CAN DO THIS TOO:=> this(name,4000.0,"bista.dinank@xyz.com");
        this.name = name;
        this.emailAddess = emailAddess;
        this.creditLimit=4000.0;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddess() {
        return this.emailAddess;
    }

    public VipCustomer(String name, double creditLimit, String emailAddess) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddess = emailAddess;
 }


}