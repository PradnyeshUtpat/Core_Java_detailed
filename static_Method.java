public class static_Method {
    public static void main(String[] args) {
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        Mobile.type = "Smartphone";
        mb1.cost = 1200;

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        Mobile.type = "Smartphone";
        mb2.cost = 1500;

        mb1.show();
        mb2.show();
        Mobile.printf(mb1);

    }
}
class Mobile{
    String brand;
    static String type;
    int cost;
    public void show(){
        System.out.println(brand + " " + type + " " + cost);
    }

    // public static void printf(){
    //     System.out.println("In static method");
    // }
    // public static void printf(){
    //     System.out.println(brand + " " + type + " " + cost);
    // }

    public static void printf(Mobile obj){
        System.out.println(obj.brand + " " + Mobile.type + " " + obj.cost);
    }
}


/*
-static var pool is a pool where all static variables are stored
-type variable won't change so lets make it static
-now if we change .type of a object all the objects' type variable will change
-static variables can be called directly on class names Eg. Mobile.type()
*/

/*
-static method can be called directly on the classname Eg. Mobile.printf()
-But if the method has non-static instance variables then it will cause a error because each object can have different var value
For static methods having non static instance vars explicitly call the method on separate objects
*/

//main method is static because of no parent class object required since execution has not yet started
//Deadlock situation