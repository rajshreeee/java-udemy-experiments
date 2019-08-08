public class Printer {
    private int toner;
    private Filterer filterer;

    public Printer(int toner,Filterer filterer) {
      if(toner>=0 && toner<=100){
          this.toner=toner;
      }else{
          this.toner=0;
      }
      this.filterer=filterer;
    }

    public Filterer getFilterer() {
        return filterer;
    }

    public void addToner(int amount){
        if(this.toner+amount<100){
            this.toner=this.toner+amount;
            System.out.println("The amount of toner added "+this.toner);
            return;
        }
            System.out.println("Can't add that much toner");

    }
}
