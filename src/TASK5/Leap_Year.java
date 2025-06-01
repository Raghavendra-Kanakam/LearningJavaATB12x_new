package TASK5;

import java.util.Scanner;
import java.util.SortedMap;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Enter a valid input");
        }else {
            int year = scanner.nextInt();
            if(year%4 == 0) {
                System.out.println("Entered year is a leap year->"+year);

            }else {
                System.out.println("Entered year is not a leap year->"+year);
            }
        }
    }
}
