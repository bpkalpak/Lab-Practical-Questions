import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Product {
    public void calculatePrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid Product Price");
        } else {
            DecimalFormat df = new DecimalFormat("#,##0");
            System.out.println("Original Price = \u20B9" + df.format(price));
        }
    }

    public void calculatePrice(double price, double discount) {
        if (price <= 0) {
            System.out.println("Invalid Product Price");
        } else if (discount < 0 || discount > 100) {
            System.out.println("Invalid Discount");
        } else {
            double finalPrice = price - (price * discount / 100.0);
            DecimalFormat df = new DecimalFormat("#,##0");
            System.out.println("Final Price = \u20B9" + df.format(finalPrice));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Changed from while loop to if statement to process single lines instantly
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            String cleanInput = input.replace(",", "");
            Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(cleanInput);
            
            double price = -1;
            double discount = -1;
            
            if (matcher.find()) {
                price = Double.parseDouble(matcher.group());
            }
            if (matcher.find()) {
                discount = Double.parseDouble(matcher.group());
            }
            
            if (price == -1) {
                scanner.close();
                return;
            }
            
            Product p = new Product();
            if (discount != -1) {
                p.calculatePrice(price, discount);
            } else {
                p.calculatePrice(price);
            }
        }
        
        scanner.close();
    }
}
