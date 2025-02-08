public class static_var {
    public static void main(String[] args) {
        Mobile2 mb1 = new Mobile2();
        mb1.brand = "Apple";
        Mobile2.type = "Smartphone";
        mb1.cost = 1200;

        Mobile2 mb2 = new Mobile2();
        mb2.brand = "Samsung";
        Mobile2.type = "Smartphone";
        mb2.cost = 1500;

        Mobile2.type = "Phone";

        mb1.show();
        mb2.show();

    }
}
class Mobile2{
    String brand;
    static String type;
    int cost;
    public void show(){
        System.out.println(brand + " " + type + " " + cost);
    }
}


/*
-static var pool is a pool where all static variables are stored
-type variable won't change so lets make it static
-now if we change .type of a object all the objects' type variable will change
-U can use static vars in non-static methods.
*/


