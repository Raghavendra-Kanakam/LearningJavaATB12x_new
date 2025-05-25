package ex_13_Functions;

public class Lab129_UD_Part1 {
    public static void main(String[] args) {
        //User Defined Functions

        //1.Without Parameters and without Return type.
        //2.Without Parameters and with Return type.
        //3.With Parameters and without Return Type.
        //4.With Parameters amd with Return Type.

        greet_type();
        String msg = getGreet_type1();
        System.out.println(msg);
        with_parameters("Raghu", 42, 400000);
        int sum = with_parameters_with_return_type(25, 26);
        System.out.println("Sum is ->" + sum);
    }

    //1.Without Parameters and without Return type.

    static void greet_type() {
        System.out.println("Hello,this is without parameters and without return type");
    }

    //2.Without Parameters and with Return type.
    static String getGreet_type1() {
        System.out.println("Hi");
        return "This is without parameters and with Return type";
    }

    //3.With Parameters and without Return Type.

    static void with_parameters(String name, int age, double sal) {
        System.out.println("Yours name is:\n" + name + "Yours age:\n" + age + "Yours Salary:\n" + sal);

    }

    //4.With Parameters amd with Return Type.

    static int with_parameters_with_return_type(int a, int b) {
        return a + b;
    }


}

