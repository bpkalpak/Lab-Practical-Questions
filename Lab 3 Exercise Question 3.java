import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split("; Search:");
            
            String[] restaurants = parts[0].split(",");
            String[] restaurantArray = new String[10];
            int count = 0;
            String longestName = "";
            
            for (int i = 0; i < restaurants.length && i < 10; i++) {
                restaurantArray[i] = restaurants[i].trim();
                count++;
                if (restaurantArray[i].length() > longestName.length()) {
                    longestName = restaurantArray[i];
                }
            }
            
            if (parts.length > 1) {
                String searchKey = parts[1].trim();
                boolean exactMatch = false;
                boolean caseInsensitiveMatch = false;
                
                for (int i = 0; i < count; i++) {
                    if (restaurantArray[i].equals(searchKey)) {
                        exactMatch = true;
                        break;
                    } else if (restaurantArray[i].equalsIgnoreCase(searchKey)) {
                        caseInsensitiveMatch = true;
                    }
                }
                
                if (exactMatch) {
                    System.out.println("Restaurant Found");
                } else if (caseInsensitiveMatch) {
                    System.out.println("Restaurant Found (Case-Insensitive Search)");
                } else {
                    System.out.println("Restaurant Not Found");
                }
            } else {
                System.out.println("Total Restaurants = " + count + ", Longest Name = " + longestName);
            }
        }
        scanner.close();
    }
}
