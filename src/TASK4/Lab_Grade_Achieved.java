package TASK4;

import java.util.Scanner;

public class Lab_Grade_Achieved {
    public static void main(String[] args) {
        char ch = 'F';
        switch(ch) {
            case 'A':
                System.out.println("Excellent grade");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
