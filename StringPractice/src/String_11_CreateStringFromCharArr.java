import java.util.Arrays;

public class String_11_CreateStringFromCharArr {
    //Java program to create a new String object with the contents of a character array.
    public static void main(String[] args) {
        char [] chaArr = {'h','a','n','s','a'};
        String name = String.copyValueOf(chaArr);

        System.out.println("Array: "+ Arrays.toString(chaArr));
        System.out.println("String: "+name);

    }
}
