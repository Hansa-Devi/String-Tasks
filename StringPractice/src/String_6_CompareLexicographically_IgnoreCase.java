public class String_6_CompareLexicographically_IgnoreCase {
    public static void main(String[] args) {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        String str3 = "this is exercise 1";

        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        System.out.println("String 3: "+str3);

        int s1_s2 = str1.compareTo(str2);
        if (s1_s2 == 0){
            System.out.println("Strings are equal");
        }
        else if (s1_s2 < 0){
            System.out.println("\""+str1 + "\" is less tha \""+str2+"\"");
        }
        else {
            System.out.println("\""+ str1 + " \" is greater than \""+str2+"\"");
        }
        int s1_s3 = str1.compareTo(str3);

        if (s1_s3 == 0){
            System.out.println("Strings are equal");
        }
        else if (s1_s3 < 0){
            System.out.println("\""+str1 + "\" is less tha \""+str3+"\"");
        }
        else {
            System.out.println("\""+str1 + "\" is greater than \""+str3+"\"");
        }

        int s1_s3_IgnoreCase = str1.compareToIgnoreCase(str3);

        if (s1_s3_IgnoreCase == 0){
            System.out.println("Strings are equal");
        }
        else if (s1_s3_IgnoreCase < 0){
            System.out.println("\""+str1 + "\" is less tha \""+str3+"\"");
        }
        else {
            System.out.println("\""+str1 + "\" is greater than \""+str3+"\"");
        }
    }
}

