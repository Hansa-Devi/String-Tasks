public class String_23_RegionMatch {
    public static void main(String[] args) {
        String str1= "Hello World";
        String str2= "World";

        System.out.println(str1.regionMatches(6,str2,0,5));
    }
}
