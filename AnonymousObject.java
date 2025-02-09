public class AnonymousObject {

    public static void main(String[] args) {



        new Calculator2().add(5, 3);
        new Calculator2().add(6, 3);
    }
}

class Calculator2 {
    public Calculator2(){
        System.out.println("Object Created");
    }
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}


// Object Created
// Sum: 8
// Object Created
// Sum: 9
