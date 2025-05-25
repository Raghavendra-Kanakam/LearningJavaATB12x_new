package ex_12_DoWhile;

public class Lab125_do_While_Real_Time {
    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.println("Execute this program atleast once before failing->" + number);
            //callFunction number
            //close the excel file,open the file
            number++;
        }while(number<0);
    }
}
