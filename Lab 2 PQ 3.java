import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String feedback = sc.nextLine();

        if (feedback.trim().isEmpty()) {
            System.out.println("Invalid Feedback Message");
        } else {
            String[] words = feedback.trim().split("\\s+");
            System.out.println("Words = " + words.length);
        }

        sc.close();
    }
}
