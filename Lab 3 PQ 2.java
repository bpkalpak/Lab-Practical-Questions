import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.replaceAll("[^0-9-]", " ").trim().split("\\s+");
            if (parts.length >= 2) {
                try {
                    int n = Integer.parseInt(parts[0]);
                    int index = Integer.parseInt(parts[1]);
                    
                    int[] arr = new int[n];
                    int val = arr[index];
                    
                    System.out.println("Element Displayed Successfully");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException");
                }
            }
        }
        scanner.close();
    }
}
