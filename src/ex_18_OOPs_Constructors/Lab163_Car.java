package ex_18_OOPs_Constructors;

import javax.xml.transform.Source;

public class Lab163_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);


        Car nano = new Car();
        nano.name = "Tata nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);
    }
}
