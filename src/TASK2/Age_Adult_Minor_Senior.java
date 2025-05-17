package TASK2;

public class Age_Adult_Minor_Senior {
    public static void main(String[] args) {
        int age = 10;
        String res = (age < 18) ? "Minor" : ((age>65) ? "Senior" : "Adult");
        System.out.println(res);
    }
}
