import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();
        String name = sc.next();
        int[] attendance = new int[7];

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
            if (attendance[i] != 0 && attendance[i] != 1) {
                System.out.println("Invalid Attendance Input");
                return;
            }
        }

        int presentDays = 0;
        for (int day : attendance) {
            presentDays += day;
        }

        int absentDays = 7 - presentDays;
        double percentage = (presentDays / 7.0) * 100;

        System.out.printf("Attendance = %.2f%%, Absent Days = %d, %s%n",
                percentage,
                absentDays,
                percentage >= 90 ? "Eligible" : "Not Eligible");
    }
}
