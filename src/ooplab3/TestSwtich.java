package ooplab3;
import java.util.Scanner;
public class TestSwtich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        switch-case
        int select;
        System.out.print("Please enter number 1-3");
        select = scanner.nextInt();
        switch (select){
            case 1:  System.out.print("Your entered 1");break;
            case 2:  System.out.print("Your entered 2");break;
            case 3:  System.out.print("Your entered 3");break;
            default:  System.out.print("Number 1-3 only");


        }//swicth

    }//main
}//class