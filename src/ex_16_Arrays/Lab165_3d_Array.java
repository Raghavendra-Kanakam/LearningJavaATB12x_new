package ex_16_Arrays;

public class Lab165_3d_Array {
    public static void main(String[] args) {
        int[][][] arr_3d = { {
                {1, 2, 3},
                {4, 5, 6}
        },
        {
            {7, 8, 9},
            {34, 33, 23}
        }
    };

        System.out.println("Elemnets at arr_3d[0][0][0] is" + arr_3d[0][0][0]);
        System.out.println("Elemnets at arr_3d[0][0][1] is" + arr_3d[0][0][1]);
        System.out.println("Elemnets at arr_3d[0][0][2] is" + arr_3d[0][0][2]);
        System.out.println("-------------");
        System.out.println("Elemnets at arr_3d[0][1][0] is" + arr_3d[0][1][0]);
        System.out.println("Elemnets at arr_3d[0][1][1] is" + arr_3d[0][1][1]);
        System.out.println("Elemnets at arr_3d[0][1][2] is" + arr_3d[0][1][2]);
        System.out.println("Got it ");
        System.out.println("Elemnets at arr_3d[1][0][2] is" + arr_3d[1][0][2]);
        System.out.println("Elemnets at arr_3d[0][0][2] is" + arr_3d[0][0][2]);


    }
}
