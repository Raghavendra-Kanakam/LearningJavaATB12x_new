package TASK3;

public class hackerrank {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 40;
        if ( (n1 == n2) && (n1 == n3)) {
            System.out.println("Trinage is equilateral");
        } else if ((n1 == n2) ||  (n1 == n3)) {
            System.out.println("Trinage is isosceles");
        }else{
            System.out.println("Triangle is scalene");
        }

        }

    }

