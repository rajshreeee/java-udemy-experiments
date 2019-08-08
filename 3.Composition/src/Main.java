public class Main {
    public static void main(String[] args){
        Manufacturer manufacturer=new Manufacturer("Dolphin techologies");
        Furniture furniture=new Furniture("Chair",50,manufacturer);
        Sofa sofa= new Sofa("softcushions","thinsheets",13,10);
        Room room=new Room(furniture,sofa);
        room.getSofa();
        room.getFurniture().getManufacturer().postManufacturer();
    }
}
