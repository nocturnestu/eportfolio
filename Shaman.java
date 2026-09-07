package shaman;

import java.util.Scanner;

public class Shaman {

    public static void main(String[] args) {
        
        float item1, item2, item3;
        float total, discount, discountedPrice;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter price of item 1: ");
        item1 = scan.nextFloat();
        
        System.out.print("enter price of item 2: ");
        item2 = scan.nextFloat();
        
        System.out.print("enter price of item 3: ");
        item3 = scan.nextFloat();
        
        total = item1 + item2 + item3;
        System.out.println("total: " + total);
        
        if (total > 1000) {
            discount = total * 0.10f;
            discountedPrice = total - discount;
            System.out.println("discount amount: " + discount);
            System.out.println("discounted price: " + discountedPrice);
        } else {
            discount = total * 0.05f;
            discountedPrice = total - discount;
            System.out.println("discount amount: " + discount);
            System.out.println("discounted price: " + discountedPrice);
        }
    }
}
