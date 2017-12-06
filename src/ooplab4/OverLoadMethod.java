package ooplab4;
//Overloading method
//Overload method
//Method Overload

public class OverLoadMethod {
    private static int number = 100;
    public static void sum (int x,int y){
        System.out.println(x + y);
        int t = number + x + y;
    }
    public static void sum(){
        System.out.println("Hello" + number);
    }
    public static void sum(int x,int y,int z){
        System.out.println(x + y + z + number);
    }

    public static void main(String[] args) {
        sum();
        sum(10, 10);
        sum(5, 5, 5);

    }//main
}//class
