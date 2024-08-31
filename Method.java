public class Method {
    public static void main(String[] args) {
        pen p = new pen();
        String pn = p.give(12);
        System.out.println(pn);
    }
    
}
class pen{
    int cost = 10;
    public String give(int money){
        if(money>=cost){
            System.out.println("Return money " + (-cost+money) + " Rs");
            return "pen";
        }
        return "nothing";
    }
}
