package ex_13_Functions;

public class Lab128_User_Defined_Functions {
    public static void main(String[] args) {

        int r1 = sum_of_two_numbers(10,25);
        int r2 = sum_of_two_numbers(90,76);
        System.out.println("r1  value ->" + r1);
        System.out.println("r2  value ->" + r2);

    }

    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }


}
