// Public class (can be accessed from anywhere)
class AccessModifiersList {

    // Public variable (accessible from anywhere)
    public String publicVar = "I am Public";

    // Private variable (accessible only within this class)
    private String privateVar = "I am Private";

    // Protected variable (accessible within the same package and subclasses)
    protected String protectedVar = "I am Protected";

    // Default (Package-private) variable (accessible only within the same package)
    String defaultVar = "I am Default (Package-Private)";

    // Public method (can be accessed from anywhere)
    public void publicMethod() {
        System.out.println("Public Method: Accessible from anywhere.");
    }

    // Private method (can be accessed only inside this class)
    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class.");
    }

    // Protected method (can be accessed within the same package and subclasses)
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within the same package and subclasses.");
    }

    // Default (Package-private) method (can be accessed within the same package)
    void defaultMethod() {
        System.out.println("Default Method: Accessible within the same package.");
    }

    // Method to demonstrate private access
    public void showPrivate() {
        System.out.println("Accessing private variable inside the class: " + privateVar);
        privateMethod();
    }
}

// Subclass to demonstrate protected access
class SubClass extends AccessModifiersList {
    void showProtected() {
        System.out.println("Accessing protected variable in subclass: " + protectedVar);
        protectedMethod();
    }
}

// Another class in the same package
class SamePackageClass {
    void showDefault() {
        AccessModifiersList obj = new AccessModifiersList();
        System.out.println("Accessing default variable in same package: " + obj.defaultVar);
        obj.defaultMethod();
    }
}

// Main class to test access modifiers
public class AccessModifiers {
    public static void main(String[] args) {
        AccessModifiersList obj = new AccessModifiersList();

        // Accessing public members
        System.out.println(obj.publicVar);
        obj.publicMethod();

        // Accessing private members (Not allowed directly, but accessible through a public method)
        obj.showPrivate();  // This method calls the private variable & method

        // Accessing protected members (Allowed within the same package)
        SubClass subObj = new SubClass();
        subObj.showProtected();

        // Accessing default members (Allowed within the same package)
        SamePackageClass samePackageObj = new SamePackageClass();
        samePackageObj.showDefault();
    }
}
