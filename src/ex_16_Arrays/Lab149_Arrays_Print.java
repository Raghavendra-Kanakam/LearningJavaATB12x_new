package ex_16_Arrays;

public class Lab149_Arrays_Print {
    public static void main(String[] args) {
        int [] marks = {45,35,67,89,79,60};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        for(int i=0;i<marks.length;i++) {
            System.out.println("Marks->"+marks[i]);
        }

        //enhanced for loop
        for(int mrks:marks){
            System.out.println("New loop marks--->"+mrks);
        }
    }
}
