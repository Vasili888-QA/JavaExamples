package simpleStartJava.com.bar;

public class Client {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isID;

    public Client(String firstName, String lastName, int age, boolean isID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isID = isID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isID() {
        return isID;
    }

}
