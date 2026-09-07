package gahdayumbutbetter;

import java.util.Scanner;

public class Gahdayumbutbetter {
    private static String name;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter employee name: ");
            String employeeId = scanner.nextLine();
            
            System.out.print("enter employee hours: ");
            double hoursWorked = scanner.nextDouble();
            
            System.out.print("enter employee hour rate: ");
            double hourlyRate = scanner.nextDouble();
            
            System.out.print("enter employee overtime: ");
            double overtimeHours = scanner.nextDouble();
            
            System.out.print("enter employee overtime rate: ");
            double overtimeRate = scanner.nextDouble();
            
            System.out.print("enter tax rate: ");
            double taxRate = scanner.nextDouble();
            
            System.out.print("enter deductions: ");
            double otherDeductions = scanner.nextDouble();
            
            double regularPay = hoursWorked * hourlyRate;
            double overtimePay = overtimeHours * overtimeRate;
            double grossPay = regularPay + overtimePay;
            double taxDeduction = grossPay * taxRate;
            double totalDeductions = taxDeduction + otherDeductions;
            double netPay = grossPay - totalDeductions;
            
            System.out.println("payroll summary");
            System.out.println("employee name: " + name);
            System.out.println("employee id: " + employeeId);
            System.out.printf("regular pay: $%.2f%n", regularPay);
            System.out.printf("overtime pay: $%.2f%n", overtimePay);
            System.out.printf("gross pay: $%.2f%n", grossPay);
            System.out.printf("tax deduction: $%.2f%n", taxDeduction);
            System.out.printf("total deductions: $%.2f%n", totalDeductions);
            System.out.printf("net pay: $%.2f%n", netPay);
        }
    }
}
