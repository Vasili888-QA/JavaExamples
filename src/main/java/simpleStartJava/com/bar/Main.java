package simpleStartJava.com.bar;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Vasili", "QA", 39, true);
        Client client2 = new Client("Tatiana", "SV", 35, true);
        Client client3 = new Client("Pavel", "Br", 20, true);
        Client client4 = new Client("Alex", "QA", 39, false);

        Admin admin = new Admin();

        //admin.checkClient(client1);
    }
}
