public class StringBuffer_ {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(stringBuffer + " " + System.identityHashCode(stringBuffer));
        String str = stringBuffer.toString();
        System.out.println(str + " " + System.identityHashCode(str));
        String str2 = "Hello";
        System.out.println(str2 + " " + System.identityHashCode(str2));
        String str3 = new String("Hello");
        System.out.println(str3 + " " + System.identityHashCode(str3));
        System.out.println(stringBuffer.capacity());
        // Append to the string
        stringBuffer.append(" World");
        System.out.println("After Appending: " + stringBuffer);

        // Insert at a specific index
        stringBuffer.insert(0, "Java ");
        System.out.println("After Inserting at Index 0: " + stringBuffer);

        // Replace a portion of the string
        stringBuffer.replace(6, 11, "Universe");
        System.out.println("After Replacing: " + stringBuffer);

        // Delete a portion of the string
        stringBuffer.delete(0, 5);
        System.out.println("After Deleting: " + stringBuffer);

        // Reverse the string
        stringBuffer.reverse();
        System.out.println("After Reversing: " + stringBuffer);

        
    }
}

/*
StringBuffer stringBuffer = new StringBuffer("Hello");
A new object is created on the heap for the StringBuffer.
The contents "Hello" are stored in a mutable memory space, allowing changes to the content.
System.identityHashCode(stringBuffer) prints a unique value representing the object address in the heap.
String str = stringBuffer.toString();

The toString() method converts the content of the StringBuffer into a new immutable String object.
This String is created on the heap, not in the string pool, even if "Hello" already exists in the pool.
The System.identityHashCode(str) will print a unique value for this heap-based String object.
String str2 = "Hello";

The literal "Hello" is stored in the string pool.
Since it's a literal, it directly points to the pooled "Hello" instance.
System.identityHashCode(str2) will show the hash code for the shared string in the pool.
String str3 = new String("Hello");

The literal "Hello" is first retrieved from the string pool (if already present).
Then, a new String object is explicitly created in the heap with the same content as "Hello".
System.identityHashCode(str3) will print a distinct value because str3 refers to a separate object in the heap, even though its content matches "Hello".
 */