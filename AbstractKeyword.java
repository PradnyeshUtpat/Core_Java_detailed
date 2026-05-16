abstract class Car2{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music");
    }
}
class Tesla1 extends Car2{
    @Override
    public void drive() {
        System.out.println("Driving Tesla");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Car2 car = new Tesla1();
        car.drive();
        car.playMusic();
    }
}


/*
1) We cannot create an object of an abstract class. So, the line "Car car = new Car();" will cause a compilation error.
2) To use the abstract class, we need to create a subclass that extends the abstract class and provides implementations for any abstract methods (if there are any). 
3) In the provided code, we have created a subclass called Tesla that extends the Car class. We can then create an instance of Tesla and assign it to a Car reference variable, which is allowed because of polymorphism.
4) The line "Car car = new Tesla();" is valid and will compile successfully. It creates an instance of Tesla and assigns it to a Car reference variable. We can then call the drive() method on the car reference, which will execute the implementation provided in the Tesla class. We can also call the playMusic() method, which is inherited from the Car class and will execute the implementation provided in the Car class.
5) You can have an abstract class without any abstract methods. 
6) If in child class all abstract methods are not implemented then the child class also needs to be declared as abstract.
*/