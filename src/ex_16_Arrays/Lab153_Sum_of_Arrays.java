package ex_16_Arrays;

public class Lab153_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] marks = {23,46,56};
        int sum =0;
        for(int i=0;i<marks.length;i++) {
            sum = sum+marks[i];

        }
        System.out.println("Total sum is---->" + sum);
    }
}
