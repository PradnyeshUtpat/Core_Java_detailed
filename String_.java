public class String_ {
    public static void main(String[] args) {
        String name = "Pradnyesh"; // We will be using this in this tutorial
        String n = new String(); // this is what actually happens behind the scenes
        n = "Prashant";
        System.out.println(n); 
        System.out.println(n.indexOf("as")); 
        System.out.println(n.charAt(3));
        System.out.println(n.endsWith("esh")); 
        System.out.println(n.startsWith("Pras"));
        name = name.concat(" Utpat");
        System.out.println(name);
    }
}
