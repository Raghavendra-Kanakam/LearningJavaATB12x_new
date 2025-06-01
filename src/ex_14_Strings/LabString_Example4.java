package ex_14_Strings;

public class LabString_Example4 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);

        System.out.println(s.codePointAt(0));

       // String res = "abc".compareTo("ABC");
       // String res2 = "abc".compareToIgnoreCase("ABC");
       // System.out.println(res);
       // System.out.println(res2);

        int ind = "Java".indexOf("a");
        System.out.println(ind);

        int indx2 = "Java".lastIndexOf("a");
        System.out.println(indx2);

        boolean b= "".isEmpty();
        System.out.println(b);

        String s12 = "Java".replace("a","o");
        System.out.println(s12);

        boolean b12 = "Java".startsWith("JA");
        System.out.println(b12);
    }
}
