package ex_15_StringBuffer_Builder_Strings;

public class Lab140_String_Functions {
    public static void main(String[] args) {

        String s1 = "Java Programming";
        System.out.println(s1.length());
        System.out.println(s1.charAt(6));
        //System.out.println(s1.charAt(20)); // StringIndexOutOfBoundsException

        //2.concat
        System.out.println(s1.concat("I am learning"));

        //3.contains
        System.out.println(s1.contains("av"));

        //4.equals
        System.out.println(s1.equals("Java Programming"));

        //5 equalsIgnore case

        System.out.println(s1.equalsIgnoreCase("java programming"));

        //6 index of
        System.out.println(s1.indexOf("P"));

        //7 length

        System.out.println(s1.length());

        //8 replace
        System.out.println(s1.replace("P","B"));

        //9 substring
        System.out.println(s1.substring(1,3));

        //10 to lowercase
        System.out.println(s1.toLowerCase());

        //11 to uppercase
        System.out.println(s1.toUpperCase());

        //12 start with
        System.out.println(s1.startsWith("J"));

        //13 endswith
        System.out.println(s1.endsWith("g"));

        //14 trim
        String s2 = "     Java   ";
        System.out.println(s2.trim());

        //15 Compareto

        System.out.println(s1.compareTo("Java"));

        StringBuilder s11 = new StringBuilder("Programming");
        System.out.println(s11);

        StringBuilder s12 = new StringBuilder("Helo");
        System.out.println(s12.toString());

        String s13 = "Naigara O Naigara";
        String s14= s13.substring(1,8);
        System.out.println(s14);

        String b1 = "Raghavendra";
        String b2 = "Kanakam";
        System.out.println(b1.concat(b2));
    }
}
