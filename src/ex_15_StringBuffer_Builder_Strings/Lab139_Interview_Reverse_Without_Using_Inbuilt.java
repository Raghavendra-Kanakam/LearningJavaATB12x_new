package ex_15_StringBuffer_Builder_Strings;

public class Lab139_Interview_Reverse_Without_Using_Inbuilt {

    public static void main(String[] args) {

        String s1 = "Kanakam";

        for(int i=s1.length()-1;i>=0;i--) {
            System.out.println(s1.charAt(i));
        }
        System.out.println("----");

        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s2.reverse());
    }
}
