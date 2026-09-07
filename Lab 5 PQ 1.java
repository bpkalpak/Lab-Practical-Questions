import java.util.Scanner;

class Product {
    String productId;
    String productName;
    double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void display() {
        if (this.price > 0) {
            System.out.println("Product Details Displayed");
        } else {
            System.out.println("Invalid Product Price");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            
            if (parts.length == 3) {
                String id = parts[0].trim();
                String name = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim());
                
                Product p = new Product(id, name, price);
                p.display();
            }
        }
        scanner.close();
    }
}
