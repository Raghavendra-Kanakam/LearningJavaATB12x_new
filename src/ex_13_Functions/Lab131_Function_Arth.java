package ex_13_Functions;

import java.util.Scanner;

public class Lab131_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner,"Enter num1:");
        int b = readInt(scanner,"Enter num2");

       int res_sum = sum(10,31);
       int res_sub = sub(25,15);
       int res_mul = mul(50,25);
       int res_div = div(25,5);
       int res_mod = mod(60,10);

        System.out.println("sum is->"+res_sum);
        System.out.println("sub is->"+res_sub);
        System.out.println("mul is->"+res_mul);
        System.out.println("div is->"+res_div);
        System.out.println("mod is->"+res_mod);

    }

    static int readInt(Scanner scanner,String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter integer value");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a,int b) {
        return a+b;
    }

        static int sub(int a,int b) {
            return a-b;
        }

        static int mul(int a ,int b){
            return a * b;
        }

        static int div(int a,int b) {
            if(b==0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a/b;
        }

        static int mod(int a,int b) {
            return a%b;
        }


}
