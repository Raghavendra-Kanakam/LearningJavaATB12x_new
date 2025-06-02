package ex_16_Arrays;

public class Lab159_2d_print_Arrays {
    public static void main(String[] args) {
        int [][] marks = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<marks.length;i++) {
            for(int j=0;j<marks.length;j++) {
                System.out.println(marks[i][j]);
            }
            System.out.println();
        }
    }
}
