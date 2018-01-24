package ooplab7;

import java.util.Scanner;

public class SuperCarApp {
    public static void main(String[] args) {
        SuperCar s1 = new SuperCar();
        System.out.println(s1.toString());


        s1 = inputData(s1);
        System.out.println(s1.toString());
    }//main
    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a car info ");
        System.out.print("Car brand: ");
        s.setCarbrand(scanner.nextLine());
        System.out.print("Car engine size: ");
        s.setCarenginesize(scanner.nextLine());
        System.out.println("Car color: ");
        s.setCarcolor(scanner.nextLine());
        System.out.print("Max speed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("Country of origin: ");
        s.setCountryoforigin(scanner.nextLine());


        return s;
    }
}
