public class Manufacturer {
    private String manufacturerName;

    public Manufacturer(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public void postManufacturer(){
        System.out.println("The manufacturer is ".concat(manufacturerName));

    }
}
