package TASK3;

public class incr1 {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;
        // Exp A-> 12
        // +
        // Exp B-> 12
        System.out.println(i);
    }
}
