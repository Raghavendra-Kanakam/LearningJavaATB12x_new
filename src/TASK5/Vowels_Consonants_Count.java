package TASK5;

import java.util.Scanner;

public class Vowels_Consonants_Count {
    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Entered string is ->"+ str);
        int count = 0;
       /* for(int i=0;i<str.length();i++) {
            if(str[i] = "a" || "e" || "i" ||"o" || "u") {
                System.out.println("Vowels count is->"+ count);
                count++;
            }else {
                System.out.println("Consonents count is->"+count);
                count++;
            }
        } */
    }
}
