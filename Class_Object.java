public class Class_Object {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.company = "Toyota ";
        myCar.model = "Camry";
        myCar.engine = "V8";
        myCar.year = 2022;

        myCar.startEngine();
        myCar.drive();
    }
}

class Car { //package private class
    
    String company = "Suzuki ";
    String model;
    String engine;
    int year;

    public void startEngine() {
        System.out.println(engine + " Engine started");
    }

    public void drive() {
        System.out.println(company + model + " Car is in motion");
    }
}
