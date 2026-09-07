import java.util.Scanner;

class Product {
    String productId;
    String productName;
    String productCategory;
    double price;

    public void display() {
    }
}

class Electronics extends Product {
    @Override
    public void display() {
        System.out.println("Electronics Product Displayed");
    }
}

class HomeAppliance extends Product {
    @Override
    public void display() {
        System.out.println("Home Appliance Product Displayed");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            
            if (parts.length > 0) {
                String lastPart = parts[parts.length - 1].trim();
                try {
                    if (lastPart.startsWith("Price = ")) {
                        lastPart = lastPart.replace("Price = ", "").trim();
                    }
                    double p = Double.parseDouble(lastPart);
                    if (p <= 0) {
                        System.out.println("Invalid Product Price");
                        scanner.close();
                        return;
                    }
                } catch (NumberFormatException e) {
                    if (input.contains("Price = 0") || input.contains("Price=0")) {
                        System.out.println("Invalid Product Price");
                        scanner.close();
                        return;
                    }
                }
            }
            
            if (input.contains("Home Appliance")) {
                Product p = new HomeAppliance();
                p.display();
            } else if (input.contains("Electronics")) {
                Product p = new Electronics();
                p.display();
            } else {
                System.out.println("Invalid Product Price");
            }
        }
        scanner.close();
    }
}
