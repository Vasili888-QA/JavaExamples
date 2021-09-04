package simpleStartJava.com.bar;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Vasili", "QA", 39, true);
        Client client2 = new Client("Tatiana", "SV", 35, true);
        Client client3 = new Client("Pavel", "Br", 20, true);
        Client client4 = new Client("Alex", "QA", 39, false);

        Admin admin = new Admin();

        System.out.println(" Check documents desk");
        admin.checkClient(client1.getFirstName(), client1.getLastName(), client1.getAge(), client1.isID());
        admin.checkClient(client2.getFirstName(), client2.getLastName(), client2.getAge(), client2.isID());
        admin.checkClient(client3.getFirstName(), client3.getLastName(), client3.getAge(), client3.isID());
        admin.checkClient(client4.getFirstName(), client4.getLastName(), client4.getAge(), client4.isID());

    }
}
