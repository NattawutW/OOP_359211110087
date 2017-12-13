package ooplab5;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Scanner;

// 1.user input data to array
// 2.show data in array
// 3.summation data in array
// 4.average value in array
public class InputDataToArray {
    private static final int MAX = 5;
    private static int number[] = new int[MAX];
    public static void main(String[] args) {

        inputData(number,number.length);
        showData(number,number.length);

    }//main



    private static void showData(int[] number, int length) {
        int total = 0; 
        for(int i=0;i<length;i++) {
            System.out.print(number[i] + " ");
            total += number[i];

        }
        System.out.println();
        System.out.println("Total is in array " + total);
        System.out.println("The average data in array:"+(total/length));
        
    }




    private static void inputData(int[] number, int length) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++) {
            System.out.print("Enter an integer ["+i+"]: ");
            number[i] = scanner.nextInt();
        }
    }//user in put data

}//class
