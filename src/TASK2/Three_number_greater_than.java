package TASK2;

public class Three_number_greater_than {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;
        int n3 = 40;

        int res = n1>n2 ? ((n1>n3)? n1 : n3) : ((n2>n3)? n2 : n3);

        System.out.println(res);
    }
}
