import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            try {
                int check = 1 / num;
                double reciprocal = 1.0 / num;
                System.out.println("Reciprocal = " + reciprocal);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
        }
        scanner.close();
    }
}
