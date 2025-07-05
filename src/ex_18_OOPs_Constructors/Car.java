package ex_18_OOPs_Constructors;

public class Car {
    String name;
    int year;
    String model;


    Car() {
        name = "Unknown car";
        model = "XXX";
        year = 1990;
        System.out.println("DC");

        LoginPage logn1 = new LoginPage();
    }
}