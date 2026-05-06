public class static_Method {
    public static void main(String[] args) {
        Mobile1 mb1 = new Mobile1();
        mb1.brand = "Apple";
        Mobile1.type = "Smartphone";
        mb1.cost = 1200;

        Mobile1 mb2 = new Mobile1();
        mb2.brand = "Samsung";
        Mobile1.type = "Phone";
        mb2.cost = 1500;

        mb1.show();
        mb2.show();
        Mobile1.printf(mb1);


        Par p = new Chi();
        p.show(); // Output: In parent class because static method is resolved at compile time based on reference type and not object type.
        

    }
}
class Chi extends Par{
    
    static void show(){
        System.out.println("In child class");
    }
}
class Par{
    static void show(){
        System.out.println("In parent class");
    }
}
class Mobile1{
    String brand;
    static String type;
    int cost;
    public void show(){
        System.out.println(brand + " " + type + " " + cost);
    }

    // public static void printf(){
    //     System.out.println("In static method");
    // }
//     public static void printf(){
//         System.out.println(brand + " " + type + " " + cost);
//     }

    public static void printf(Mobile1 obj){
        System.out.println(obj.brand + " " + Mobile1.type + " " + obj.cost);
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
//static method can't access non static instance variables directly because they are not associated with any object and each object can have different values for those variables
//static method can access static variables directly because they are associated with the class and shared among all objects
//Deadlock situation