package ooplab3;

public class TestNestedLoop {
    public static void main(String[] args) {
        int x = 1 ;
        for (int i=1; i<=8;i++) {
            //statement
            for (int j=1;j<=i;j++){
                //statement
                if (i==8||i==j||j==1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(x + "\t ");
                    x++;}
            }//j
            System.out.println();
        }//i
    }//main
}//class
