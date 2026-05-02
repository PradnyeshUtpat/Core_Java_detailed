public class NeedForThis {
    public static void main(String[] args) {
        Human_2 human = new Human_2();
        human.setAge(15);
        human.setName("Alice");
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }
}

class Human_2{
    private int age=10;
    private String name="Pradnyesh";
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        // age = age; // This will not work as expected due to variable shadowing age=10
        this.age = age; // Using 'this' to refer to the instance variable
    }
    public void setName(String name){
        // name = name; // This will not work as expected due to variable shadowing name="Pradnyesh"
        this.name = name; // Using 'this' to refer to the instance variable
    }

    public String getName(){
        return name;
    }
}