public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getAge());
        System.out.println(human.getName());
        human.setAge(15);
        human.setName("hello");

    }
}

class Human {
    private int age = 11;
    private String name = "Pradnyesh";
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }

}
