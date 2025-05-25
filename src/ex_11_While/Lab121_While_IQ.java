package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) {
            System.out.println("Enter proper integer input");
        }
        int num = scanner.nextInt();
        int factorial = 1;
        if (num == 0) {
            System.out.println("Factorial is->"+factorial);
        }

        if (num > Integer.MAX_VALUE) {
            System.out.println("can't get the factorial as out of bound(int)");
        }
        int i=1;
        while (i<=num) {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial for given number is->"+factorial);
    }
}
