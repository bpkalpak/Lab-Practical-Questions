import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(",", 2);

        String feedback = parts[0].trim();
        String keyword = parts.length > 1 ? parts[1].trim() : "";

        if (feedback.isEmpty()) {
            System.out.println("Invalid Feedback Message");
        } else if (feedback.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword Found");
        } else {
            System.out.println("Keyword Not Found");
        }

        sc.close();
    }
}
