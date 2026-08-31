import java.util.Scanner;

class Student {
    static String collegeName = "Universal College";
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void display() {
        if (this.studentName.equals("Student 1")) {
            System.out.println("College Name Displayed");
        } else {
            System.out.println("Same College Name Displayed");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            Student student = new Student(input);
            student.display();
        }
        scanner.close();
    }
}
