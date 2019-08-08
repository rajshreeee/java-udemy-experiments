public class Main {
    public static void main(String[] args){
        Printer printer=new Printer(40,new Filterer(21,true));
        printer.addToner(62);
        System.out.println("Pages Printed "+printer.getFilterer().pagesPrinted());
    }
}
