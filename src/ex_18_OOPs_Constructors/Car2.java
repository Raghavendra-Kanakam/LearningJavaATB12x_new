package ex_18_OOPs_Constructors;

import java.sql.SQLOutput;

public class Car2 {
    String model;
    int year;

    Car2(){
        model = "xxx";
        year = 2025;
        System.out.println("DC");
    }

    Car2(String model_name,int year_created) {
        //this("3000");
        this.model = model_name;
        this.year = year_created;
    }

    Car2(String model_name) {
        this.model = model_name;
    }
}
