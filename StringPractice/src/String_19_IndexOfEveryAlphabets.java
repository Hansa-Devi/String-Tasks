public class String_19_IndexOfEveryAlphabets {
    //Java program to get the index of all the characters of the alphabet
    public static void main(String[] args) {
        String str  = "the quick brown fox jumps over the lazy dog";
        System.out.println("String: "+str);

        //method 1
//        for (int i = 0; i <str.length() ; i++) {
//            System.out.println(str.charAt(i)+" index is: "+ i);
//        }

        //method 2
        int a = str.indexOf("a");
        int b = str.indexOf("b");
        int c = str.indexOf("c");
        int d = str.indexOf("d");
        int e = str.indexOf("e");
        int f = str.indexOf("f");
        int g = str.indexOf("g");
        int h = str.indexOf("h");
        int i = str.indexOf("i");
        int j = str.indexOf("j");
        int k = str.indexOf("k");
        int l = str.indexOf("l");
        int m = str.indexOf("m");
        int n = str.indexOf("n");
        int o = str.indexOf("o");
        int p = str.indexOf("p");
        int q = str.indexOf("q");
        int r = str.indexOf("r");
        int s = str.indexOf("s");
        int t = str.indexOf("t");
        int u = str.indexOf("u");
        int v = str.indexOf("v");
        int w = str.indexOf("w");
        int x = str.indexOf("x");
        int y = str.indexOf("y");
        int z = str.indexOf("z");

        System.out.println("a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "
                +l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);



        }
    }

