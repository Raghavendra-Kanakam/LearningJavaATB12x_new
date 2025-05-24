package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        int itemcode = 001;

        switch (itemcode) {
            case 001 -> System.out.println("0001");
            case 002 -> System.out.println("0002");
            case 003 -> System.out.println("0003");
            default -> System.out.println("nothing");
        }

    }
}
