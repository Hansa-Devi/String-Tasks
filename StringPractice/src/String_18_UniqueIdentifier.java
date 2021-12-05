public class String_18_UniqueIdentifier {
    //Java program to create a unique identifier of a given string.
    public static void main(String[] args) {
        String str = "Hello World";
        int hashCode = str.hashCode();

        System.out.println("String: "+str);
        System.out.println("Unique Identifier (HashCode): "+hashCode);
    }
}
