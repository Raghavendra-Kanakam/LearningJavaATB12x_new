package ex_16_Arrays;

public class Lab164_Highest_Array {
    public static void main(String[] args) {
        int[] marks = {12,45,67,23,89,45,89};
        int highest = 0;
        int secondhighest =0;

        for (int num:marks) {
            if(num > highest) {
                secondhighest = highest;
                highest = num;
            } else if (num > secondhighest && num!= highest) {
                secondhighest = num;
            }

        }
        System.out.println("SecondHighest---->" + secondhighest);
    }
}
