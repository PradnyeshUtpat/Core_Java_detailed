public class StringBuffer_ {
    public static void main(String[] args) {
        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

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
