public class String_8_CheckSpecChar {
    //Java program to test if a given string contains the specified sequence of char values.
    public static void main(String[] args) {
        String sentence = "Hello its me Hansa";
        String name= "Hansa";

        System.out.println("String 1 : "+sentence);
        System.out.println("Test name "+name+" in there in sentence: "+sentence.contains(name));

        //Java program to compare a given string to the specified character sequence.
        // Java program to compare a given string to the specified string buffer

        StringBuffer sentence2 = new StringBuffer("hello its me hansa");

        System.out.println("String 2 : "+sentence2);
        System.out.println("Compare sting1 and String2:"+sentence.compareTo(String.valueOf(sentence2)));
        System.out.println("Compare sting1 and String2:"+sentence.contentEquals(sentence2));
        System.out.println("Compare sting1 and String2 :"+sentence.equals(sentence2));
        System.out.println("Compare sting1 and String2 Ignore Case:"+sentence.equalsIgnoreCase(String.valueOf(sentence2)));
        System.out.println("Compare sting1 and String2 Ignore Case:"+sentence.contains(sentence2));

    }
}
