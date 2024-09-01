public class Mutable_Immutable_String {
    public static void main(String[] args) {
        String s1 = "Pradnyesh";
        String s2 = "Pradnyesh";
        s1 = s1 + " Utpat";
        System.out.println(s1==s2);

        /* 
            What exactly is happening behind the scenes?
            -first Pradnyesh appended to constant string pool
            -s1 points to address
            -s2 points to same address because it finds that same string it is holding
            -now s1 changed new string appended to pool and address s1 pointing to changes
            -Now s1!=s2
        
        */ 
    }

}