import java.util.Arrays;

public class String_17_StringAsCharArr {
    //Java program to get the contents of a given string as a character array
    public static void main(String[] args) {
        String name = "Hansa";
        System.out.println("String: "+name);
        char [] chaArr = name.toCharArray();
        System.out.println("CharArray: "+chaArr);
        System.out.println("CharArray:"+ Arrays.toString(chaArr));
    }
}
