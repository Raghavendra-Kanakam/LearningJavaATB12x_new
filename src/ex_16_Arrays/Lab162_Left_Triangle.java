package ex_16_Arrays;

import java.util.Scanner;

public class Lab162_Left_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number od=f rows,e.g :3");
        int num = scanner.nextInt();


        for(int i=num;i>=1;i--) {
            for(int j= 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
