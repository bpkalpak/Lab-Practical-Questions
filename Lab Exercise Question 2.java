import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String customerName = sc.nextLine();
        String feedback = sc.nextLine();
        String keyword = sc.nextLine();

        if (feedback.trim().isEmpty()) {
            System.out.println("Invalid Feedback Message");
        } else if (feedback.length() > 500) {
            System.out.println("Feedback Exceeds Maximum Length");
        } else {
            int characters = feedback.length();
            int words = feedback.trim().split("\\s+").length;
            int count = 0;

            String text = feedback.toLowerCase();
            String key = keyword.toLowerCase();

            int index = 0;
            while ((index = text.indexOf(key, index)) != -1) {
                count++;
                index += key.length();
            }

            if (count > 0) {
                System.out.println("Characters = " + characters + ", Words = " + words + ", Keyword Found = " + count);
            } else {
                System.out.println("Characters = " + characters + ", Words = " + words + ", Keyword Not Found");
            }
        }

        sc.close();
    }
}
