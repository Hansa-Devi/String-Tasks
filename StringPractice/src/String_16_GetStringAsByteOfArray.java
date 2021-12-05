import java.util.Arrays;

public class String_16_GetStringAsByteOfArray {
    //Java program to get the contents of a given string as a byte array.
    public static void main(String[] args) {
        String str = "this is string";
        byte [] arr = str.getBytes();

        System.out.println(str);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        String str2 = new String(arr);
        System.out.println(str2);
    }
}
