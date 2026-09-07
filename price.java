package price;

import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter original price: ");
        double originalPrice = scanner.nextDouble();
        
        System.out.print("enter discount rate: ");
        double discountRate = scanner.nextDouble();
        
        double discountAmount = originalPrice * (discountRate / 100.0);
        double salePrice = originalPrice - discountAmount;
              
        System.out.printf("discount amount: P%.2fn", discountAmount);
        System.out.printf("sale price: P%.2fn ", salePrice);
        
        scanner.close();
    }
}
