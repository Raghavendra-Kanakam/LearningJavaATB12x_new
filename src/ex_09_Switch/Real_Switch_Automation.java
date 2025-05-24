package ex_09_Switch;

import java.util.Scanner;

public class Real_Switch_Automation {

    // Web Automation
    // I will ask the user to give me the input from browser which he wants to
    // use to I will start the automation in that browser.
    public static void main(String[] args) {

        //String browser = args[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Enter to chrome");
                break;
            case "ie":
                System.out.println("Enter to internet explorer");
                break;
            case "mozilla":
                System.out.println("Enter to mozilla");
                break;
            default:
                System.out.println("Could not find the browser");

        }

    }
}
