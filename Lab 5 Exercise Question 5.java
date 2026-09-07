import java.util.Scanner;
import java.text.DecimalFormat;

interface Payment {
    String processPayment();
}

class OnlinePayment implements Payment {
    public String processPayment() {
        return "Payment Successful";
    }
}

abstract class Product {
    double price;
    double discount;

    Product(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    abstract double calculateFinalPrice();
}

class Item extends Product {
    Item(double price, double discount) {
        super(price, discount);
    }

    @Override
    double calculateFinalPrice() {
        return calculateFinalPrice(this.price, this.discount);
    }

    double calculateFinalPrice(double p, double d) {
        return p - (p * d / 100.0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            if (input.trim().isEmpty()) {
                scanner.close();
                return;
            }

            try {
                int pStart = input.indexOf("Price:") + 6;
                int dStart = input.indexOf("Discount:");
                String priceStr = input.substring(pStart, dStart).replaceAll("[^0-9]", "");
                double price = Double.parseDouble(priceStr);

                int pmStart = input.indexOf("Payment Mode:");
                String discountStr = input.substring(dStart + 9, pmStart).replaceAll("[^0-9.]", "");
                double discount = Double.parseDouble(discountStr);

                if (price <= 0) {
                    System.out.println("Invalid Product Price");
                } else {
                    Product item = new Item(price, discount);
                    Payment payment = new OnlinePayment();
                    
                    double finalPrice = item.calculateFinalPrice();
                    DecimalFormat df = new DecimalFormat("#,##0");
                    
                    System.out.println("Final Price = \u20B9" + df.format(finalPrice) + ", " + payment.processPayment());
                }
            } catch (Exception e) {
                System.out.println("Invalid Product Price");
            }
        }
        
        scanner.close();
    }
}
