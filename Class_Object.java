public class Class_Object {
    public static void main(String[] args) {
        Car myCar = new Car();

        //myCar.make = "Toyota ";
        myCar.model = "Camry";
        myCar.engine = "V8";
        myCar.year = 2022;

        myCar.startEngine();
        myCar.drive();
    }
}

class Car {
    
    String make = "Suzuki ";
    String model;
    String engine;
    int year;

    public void startEngine() {
        System.out.println(engine + " Engine started");
    }

    public void drive() {
        System.out.println(make + model + " Car is in motion");
    }
}