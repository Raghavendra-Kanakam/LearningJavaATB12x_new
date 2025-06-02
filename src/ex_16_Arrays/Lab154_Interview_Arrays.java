package ex_16_Arrays;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Lab154_Interview_Arrays {
    public static void main(String[] args) {
        int [] num = {12,34,56,77,89,60};
        Arrays.sort(num);
        System.out.println(num[num.length - 2]);
        System.out.println(num[num.length - 1]);
        System.out.println(num.length);
    }
}
