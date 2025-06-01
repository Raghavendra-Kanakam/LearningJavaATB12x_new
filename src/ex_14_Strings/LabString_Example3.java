package ex_14_Strings;

public class LabString_Example3 {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s);

        String s1 = "Java".substring(1,3);
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr); //['J','a','v','a']

        String st = " Java ".trim();
        System.out.println(st);

        boolean b = "   ".isBlank();
        System.out.println(b);

        String s3 = "ab".repeat(3);
        System.out.println(s3);

        boolean b2 = "Java".equalsIgnoreCase("java");
        System.out.println(b2);

        String s11 = String.format("%s = %d","age" ,25);
        System.out.println(s11);

        long count = "a\n\b\nc".lines().count();
        System.out.println(count);


    }
}
