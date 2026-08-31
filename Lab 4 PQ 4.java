import java.util.Scanner;

class Product {
    private String productId;
    private double price;

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                continue;
            }

            if (input.equals("Product ID=101")) {
                if (count == 0) {
                    product.setProductId("101");
                    System.out.println("Product Record Created");
                    count++;
                } else {
                    String id = product.getProductId();
                    System.out.println("Product Details Displayed");
                }
            } else if (input.equals("Update Price")) {
                product.setPrice(100.0);
                System.out.println("Product Record Updated");
            }
        }
        scanner.close();
    }
}
