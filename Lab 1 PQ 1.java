import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");

        int n = sc.nextInt();
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        int sum = 0;

        System.out.print("Grades: ");

        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            sum += mark;

            if (mark >= 90) {
                System.out.print("A");
                a++;
            } else if (mark >= 80) {
                System.out.print("B");
                b++;
            } else if (mark >= 70) {
                System.out.print("C");
                c++;
            } else if (mark >= 60) {
                System.out.print("D");
                d++;
            } else {
                System.out.print("F");
                f++;
            }

            if (i < n - 1)
                System.out.print(" ");
        }

        System.out.println();
        System.out.println("A=" + a + ", B=" + b + ", C=" + c + ", D=" + d + ", F=" + f);
        System.out.printf("Average = %.1f%n", (double) sum / n);
    }
}
