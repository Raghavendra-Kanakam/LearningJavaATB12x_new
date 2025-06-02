package ex_16_Arrays;

public class Lab146_Arrays {
    public static void main(String[] args) {
        int [] marks = {90,89,45,35,100,75};

        boolean [] is_married = {true,false,true};
        System.out.println(marks.length);
        System.out.println(marks[1]);
        System.out.println(marks[5]);
      //  System.out.println(marks[10]); // ArrayIndexOutOfBoundsException

        char ch = 'A';
        String s11 = "Programming";
        String [] name_split = s11.split("\t");
        System.out.println(name_split);
    }
}
