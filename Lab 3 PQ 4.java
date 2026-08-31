import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException() {
        super("LowBalanceException");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String numStr = input.replaceAll("[^0-9]", "");
            if (!numStr.isEmpty()) {
                int balance = Integer.parseInt(numStr);
                try {
                    if (balance < 1000) {
                        throw new LowBalanceException();
                    }
                    System.out.println("Valid Balance");
                } catch (LowBalanceException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
    }
}
