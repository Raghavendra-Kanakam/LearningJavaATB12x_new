package TASK4;

import java.util.Scanner;

public class Lab_Leap_Year_Number_Of_Months_Switch {
    public static void main(String[] args) {
        System.out.println("Enter the months from 1 to 12:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Enter the year:");
        Scanner scanner1 =  new Scanner(System.in);
        int year = scanner.nextInt();
        switch(month) {
            case 1:
                System.out.println("Month January has 31 days in the year:"+ year);
                break;
            case 2:
                if(year%4 == 0){
                    System.out.println("year is leap year and month Febraury has 29 days in the year:"+ year);
                    break;
                } else {
                    System.out.println("Month Febraury has only 28 days in the year:"+ year);
                    break;
                }
            case 3:
                System.out.println("Month march has 31 days in the year:"+ year);
                break;
            case 4:
                System.out.println("Month April has 30 days in the year:"+ year);
                break;
            case 5:
                System.out.println("Month May has 31 days in the year:"+ year);
                break;
            case 6:
                System.out.println("Month June has 30 days in the year:"+ year);
                break;
            case 7:
                System.out.println("Month July has 31 days in the year:"+ year);
                break;
            case 8:
                System.out.println("Month August has 31 days in the year:"+ year);
                break;
            case 9:
                System.out.println("Month September has 30 days in the year:"+ year);
                break;
            case 10:
                System.out.println("Month October has 31 days in the year:"+ year);
                break;
            case 11:
                System.out.println("Month November has 30 days in the year:"+ year);
                break;
            case 12:
                System.out.println("Month December has 31 days in the year:"+ year);
                break;
            default:
                System.out.println("Valid proper input");
        }
    }
}
