public class Furniture {
    private String type;
    private int size;
    private Manufacturer manufacturer;

    public Furniture(String type,int size,Manufacturer manufacturer){
        this.type=type;
        this.size=size;
        this.manufacturer=manufacturer;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
