public class Filterer {
    private int pagesToPrint;
    private boolean duplex;


    public Filterer(int pagesToPrint, boolean duplex) {
        this.pagesToPrint = pagesToPrint;
        this.duplex = duplex;
    }
    public int pagesPrinted(){
        if(this.duplex && this.pagesToPrint%2==0){
           int pages=this.pagesToPrint/2;
           return pages;
        }
        else if(this.duplex && this.pagesToPrint%2==1){
            int pages=this.pagesToPrint/2+1;
            return pages;
        }
        return pagesToPrint;

    }
}
