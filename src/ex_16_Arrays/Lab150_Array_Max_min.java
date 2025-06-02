package ex_16_Arrays;

public class Lab150_Array_Max_min {
    public static void main(String[] args) {
        int[] marks = {25,14,15,36,56,77,18,29,49};
        int max = marks[0];
        int min = marks[0];

        for(int i=0;i<marks.length;i++) {
            if(marks[i] > max) {
                max = marks[i];

            }

        }

        for(int i=0;i<marks.length;i++) {
            if(marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Max value is---"+max);
        System.out.println(("Min vale is ---->" +min));

    }
}
