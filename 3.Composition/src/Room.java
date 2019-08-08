public class Room {
    private Furniture furniture;
    private Sofa sofa;

    public Room(Furniture furniture, Sofa sofa) {
        this.furniture = furniture;
        this.sofa = sofa;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void getSofa() {
        System.out.println(sofa.getCushions());
    }
}
