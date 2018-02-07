package ooplab9;

public class App {
    public static void main(String[] args) {
        Person person = new Person("359211110087", "Nattawut", "113/22 m.1 t.makhamtier");
        System.out.println(person.toString());

        Address address =new Address("16","Surattani","84000");
        System.out.println(address.toString());

        Job job = new Job("sales",15000);
        System.out.println(job.toString());

    }//main
}//class