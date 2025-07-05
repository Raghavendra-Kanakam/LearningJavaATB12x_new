package ex_18_OOPs_Constructors;

import org.w3c.dom.ls.LSOutput;

public class Lab163_OOPS_Con {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
    }
}


class A {
    A() {
        System.out.println("I want to read a CSV File");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do what you want to do when object is created");
    }
}