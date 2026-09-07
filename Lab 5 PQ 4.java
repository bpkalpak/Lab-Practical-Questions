import java.util.Scanner;

interface Payment {
    void processPayment();
}

class UPI implements Payment {
    public void processPayment() {
        System.out.println("Payment Successful");
    }
}

class CreditCard implements Payment {
    public void processPayment() {
        System.out.println("Payment Successful");
    }
}

class DebitCard implements Payment {
    public void processPayment() {
        System.out.println("Payment Successful");
    }
}

class NetBanking implements Payment {
    public void processPayment() {
        System.out.println("Payment Successful");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            Payment payment = null;
            
            if (input.equals("UPI")) {
                payment = new UPI();
            } else if (input.equals("Credit Card")) {
                payment = new CreditCard();
            } else if (input.equals("Debit Card")) {
                payment = new DebitCard();
            } else if (input.equals("Net Banking")) {
                payment = new NetBanking();
            } else {
                System.out.println("Invalid Payment Mode");
            }
            
            if (payment != null) {
                payment.processPayment();
            }
        }
        scanner.close();
    }
}
