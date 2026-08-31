import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid Age Exception");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String numStr = input.replaceAll("[^0-9]", "");
            if (!numStr.isEmpty()) {
                int age = Integer.parseInt(numStr);
                try {
                    if (age < 18) {
                        throw new InvalidAgeException();
                    }
                    System.out.println("Eligible to Vote");
                } catch (InvalidAgeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
    }
}
