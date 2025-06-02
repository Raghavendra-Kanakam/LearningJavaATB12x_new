package ex_16_Arrays;

import java.util.Scanner;

public class Lab151_Arrar_User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num = scanner.nextInt();

        String[] num_marks = new String[num];
        //float [] num1_marks = new float[num];
        //int [] num2_marks = new int[num];

        for(int i =0;i<num_marks.length;i++) {
            System.out.println(" Enter the elements " + i);
            num_marks[i] = scanner.next();
        }

        System.out.println("---Print the values---");
        for(String num11:num_marks) {
            System.out.println(num11);
        }
        scanner.close();
    }
}
