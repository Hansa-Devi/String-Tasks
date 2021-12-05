import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        String s1="Hello World";
        String s2 = "HELLO WORLD";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf("o",5));
        System.out.println(s1.indexOf("World"));
        System.out.println(s1.indexOf(" "));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(6,8));

        System.out.println(s2 + s1);

        StringBuffer s = new StringBuffer("Hello");
        System.out.println(s.append(" world"));
        System.out.println(s.reverse());

        String names = "Hansa ,Hannah ,Pagal";
        String [] n = names.split(",");
        for (String arrNames:n) {
            System.out.println(arrNames);
        }


    }
}
