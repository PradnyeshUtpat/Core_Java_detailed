public class Constructor {
    public static void main(String[] args) {
        Human_1 human = new Human_1(12,"hello");
        System.out.println(human.getAge());
        System.out.println(human.getName());

    }
}

class Human_1 {
    // private int age = 11;
    // private String name = "Pradnyesh";
    private int age;
    private String name;
    Human_1() //default
    {
        age = 11;
        name = "Pradnyesh";
        System.out.println("in constructor");
    }
    Human_1(int age , String name){ //parametrised
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

}

//Constructor has same name as class
//Constructor called after the object has been initialised
//Constructor never returns anything
//Constructor will be called always