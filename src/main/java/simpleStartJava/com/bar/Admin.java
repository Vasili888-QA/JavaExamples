package simpleStartJava.com.bar;

public class Admin {

    public void checkClient(String clientFirstName, String clientLastName, int clientAge, boolean clientIsID) {
        if (!clientIsID) {
            System.out.println(clientFirstName + " " + clientLastName + " Sorry you don't have Driver License! Go home it's privet party");
        } else if (clientAge < 20) {
            System.out.println(clientFirstName + " " + clientLastName + " Sorry you so young! Go home" + clientFirstName);
        } else {
            System.out.println("Hello " + clientFirstName + " " + clientLastName + " Welcome to our privet party");
        }
    }
}
