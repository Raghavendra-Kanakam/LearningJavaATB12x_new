package ex_14_Strings;

public class Lab138_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";   //SCP
        String s4 = "Hello";   //scp

        String s2 = new String("Hello");  //Heap area
        String s3 = new String("Hello");  //Heap area
        String s5 = new String("hello");  //Heap area


        //== comparision ->String-->This will check ref location
        System.out.println(s1 == s2 );  //This will check reference area where it is located one in SCP amd other in Heap area
        System.out.println(s1 == s4); //both in SCP
        System.out.println(s4 == s5); //SCP and Heap area
        System.out.println(s2 == s3); //both in heap area but new will give different jar for s2 and s3


        //equal(content) ----> value
        System.out.println(s1.equals(s2)); //This will compare string is same or different
    }
}
