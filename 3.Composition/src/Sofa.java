public class Sofa {
    private String cushions;
    private String sheets;
    private int size;
    private int number;

    public Sofa(String cushions, String sheets, int size, int number) {
        this.cushions = cushions;
        this.sheets = sheets;
        this.size = size;
        this.number = number;
    }

    public String getCushions() {
      return cushions;
    }

    public int getSize() {
        return size;
    }

    public String getSheets() {
        return sheets;
    }

    public void numberofCushions(String cushions) {
        System.out.println("There are "+this.number+"sofas");
    }
}
