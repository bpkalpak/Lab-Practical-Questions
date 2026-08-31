import java.util.Scanner;

class Employee {
    int id;
    String name;

    public void updateDetails(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Employee Record Updated");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (parts.length == 2) {
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                
                Employee employee = new Employee();
                employee.updateDetails(id, name);
            }
        }
        scanner.close();
    }
}
