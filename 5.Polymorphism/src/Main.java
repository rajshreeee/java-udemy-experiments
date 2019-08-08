public class Main{


    public static void main(String[] args){
        class Car{
            public String name;
            private int cylinders;
            private int wheels;
            private boolean engine;
            public Car(String name, int cylinders) {
                this.name = name;
                this.cylinders = cylinders;
                this.wheels = 4;
                this.engine = true;
            }
            public String getName() {
                return name;
            }
            public int getCylinders() {
                return cylinders;
            }
            public int getWheels() {
                return wheels;
            }
            public boolean isEngine() {
                return engine;
            }
            public void startEngine(){
                System.out.println(this.name.concat(" ").concat("has its engine started"));
            }
            public void accelerate(){
                System.out.println(this.name.concat(" ").concat("is accelerating"));
            }
            public void brake(){
                System.out.println("The car is stopping");
            }

        }
        class BMW extends Car{

            public BMW(String name, int cylinders) {
                super(name,cylinders);

            }

            @Override
            public void startEngine() {
                System.out.println(this.name.concat(" ").concat("has its engine started"));
            }

            @Override
            public void accelerate() {
                System.out.println(this.name.concat(" ").concat("is accelerating"));

            }

            @Override
            public void brake() {
                System.out.println(this.name.concat(" ").concat("is stopping"));
            }
        }
        class Mercedes extends Car{
            public Mercedes(String name, int cylinders) {
                super(name, cylinders);

            }

            @Override
            public void startEngine() {
                System.out.println(this.name.concat(" ").concat("has its engine started"));
            }

            @Override
            public void accelerate() {
                System.out.println(this.name.concat(" ").concat("is accelerating"));
            }

            @Override
            public void brake() {
                System.out.println(this.name.concat(" ").concat("is stopping"));
            }
        }

        class Ferrari extends Car{
            public Ferrari(String name, int cylinders) {
                super(name, cylinders);

            }

            @Override
            public void startEngine() {
                String name="dinank";
                System.out.println(name.equalsIgnoreCase("DINANK"));

             }

            @Override
            public void accelerate() {
                System.out.println(this.name.concat(" ").concat("is accelerating"));
            }

            @Override
            public void brake() {
                System.out.println(this.name.concat(" ").concat("is stopping"));
            } 
        }
        Car car=new Car("Engine",4);
        car.startEngine();
        Ferrari ferrari=new Ferrari("Engines",5);
        ferrari.startEngine();
        BMW bmw=new BMW("Eng",5);
        bmw.startEngine();
        Mercedes mercedes=new Mercedes("Engineer",6);
        mercedes.startEngine();
    }

}
