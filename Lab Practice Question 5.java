import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String customerName = sc.nextLine();

        if (customerName.trim().isEmpty() || customerName.length() > 50) {
            System.out.println("Invalid Customer Name");
        } else {
            System.out.println("Customer Name:");
            System.out.println(customerName);
        }

        sc.close();
    }
}
