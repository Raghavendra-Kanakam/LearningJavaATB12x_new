package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1.concat(s3));
    }
}
