public class String_2_GetUnicodeOfCharacter {

    // Java program to get the character (Unicode code point) at the given index within the String.
    public static void main(String[] args) {
        String name = "Hansa Devi";
        System.out.println(name);
        System.out.println("Unicode  of Character at index 1: " + name.codePointAt(1));

    //Java program to get the character (Unicode code point) before the specified index within the String.
        System.out.println("Unicode  of Character before index 2: " + name.codePointBefore(2));

    //Java program to count a number of Unicode code points in the specified text range of a String.
        System.out.println("Number of Unicode Between 3 to 8: "+ name.codePointCount(3,8));

    }
}
