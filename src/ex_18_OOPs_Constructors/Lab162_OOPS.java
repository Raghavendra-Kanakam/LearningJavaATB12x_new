package ex_18_OOPs_Constructors;

import ex_17_OOPs.Baby;

public class Lab162_OOPS {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        //new Baby();
        //Baby b2;

    }
}

class Girl {
    Girl() {
        System.out.println("I am called when object is created");
    }
}

