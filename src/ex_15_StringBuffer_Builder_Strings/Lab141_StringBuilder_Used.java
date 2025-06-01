package ex_15_StringBuffer_Builder_Strings;

public class Lab141_StringBuilder_Used {
    public static void main(String[] args) {

        //String 90% used
        String s1 = "Raghavendra";
        String s2 = new String("Great");
        System.out.println(s1);


        //<10% used
        StringBuilder s12 = new StringBuilder("Kanakam");
        StringBuffer s13 = new StringBuffer("Learning");
        System.out.println(s12);
        System.out.println(s13);
        System.out.println(s12.reverse());
        System.out.println(s13.reverse());

    }
}
