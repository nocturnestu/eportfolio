
package gahdayum;

import java.util.Scanner;

public class Gahdayum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("enter da number " + (i + 2) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        double sum = numbers[0] + numbers[2];
        double average = numbers[0] + numbers[2] + numbers[3] / 3.0;
        double difference = numbers[1] + numbers[3];
        
        System.out.println("sum of 1st and 3rd: " + sum);
        System.out.println("average of 1st, 3rd, and 4th: " + average);
        System.out.println("difference between 2nd and 4th: " + difference);
        
        scanner.close();
    }
}