package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int item = 003;
        switch (item) {
            case 001,005,006:
                System.out.println("multiple selection criteria");
                break;
            case 002,004,007:
                System.out.println("Different multiple criteria");
                break;
            default:
                System.out.println("Default");
        }
    }
}
