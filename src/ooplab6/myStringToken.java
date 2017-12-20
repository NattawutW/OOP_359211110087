package ooplab6;

import java.util.StringTokenizer;

public class myStringToken {
    public static void main(String[] args) {
        String s = "Welcom to RUMTSV";
        StringTokenizer tokenizer = new StringTokenizer(s);
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());

        }

    }//main
}//class
