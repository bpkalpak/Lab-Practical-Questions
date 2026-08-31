import java.util.Scanner;

class Student {
    int studentId;
    String name;
    double cgpa;

    public Student(int studentId, String name, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Student Details Displayed");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (parts.length == 3) {
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double cgpa = Double.parseDouble(parts[2].trim());
                
                Student student = new Student(id, name, cgpa);
                student.displayDetails();
            }
        }
        scanner.close();
    }
}
