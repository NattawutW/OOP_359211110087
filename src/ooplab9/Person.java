package ooplab9;

public class Person {
    private String personID;
    private String name;
    private String Address;
    private String job;

    public Person(String personID, String name, String address, String job) {
        this.personID = personID;
        this.name = name;
        Address = address;
        this.job = job;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
