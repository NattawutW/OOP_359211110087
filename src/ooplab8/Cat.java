package ooplab8;

public class Cat extends Pet{

    public Cat(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {         System.out.println("Miew Miew !!!");


    }
}
