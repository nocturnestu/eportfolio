package gahdayumbutbetterbetter;
import java.util.*;
public class Gahdayumbutbetterbetter {
    public static void main(String[] args) {
       System.out.println("hello world");
       Scanner input = new Scanner(System.in);
       String employerName;
       double employerID;
       double numberOfHoursWorked;
       double hourlyRate;
       double overtimeHours;
       double overtimeRate;
       double taxRate;
       double otherDeductions;
       double regularPay;
       double overtimePay;
       double grossPay;
       double taxDeduction;
       double netPay;
       double totalDeductions;
       System.out.println("enter the employer name: ");
       employerName = input.nextLine();
       System.out.println("enter the employer id: ");
       employerID = input.nextInt();
       System.out.println("enter the number of hours worked: ");
       numberOfHoursWorked = input.nextDouble();
       System.out.println("enter the hourly rate: ");
       hourlyRate = input.nextDouble();
       System.out.println("enter the tax rate: ");
       taxRate = input.nextDouble();
       System.out.println("enter other deductions: ");
       otherDeductions = input.nextDouble();
       if (numberOfHoursWorked > 10) {
           overtimeHours = 40 * numberOfHoursWorked;
       } else {
           overtimeHours = 0;
       }
       if (numberOfHoursWorked > 10) {
           regularPay = 40 * hourlyRate;
       } else {
           regularPay = numberOfHoursWorked * hourlyRate;
       }
       overtimeRate = hourlyRate * 1.5;
       overtimePay = overtimeHours * overtimeRate;
       grossPay = regularPay + overtimePay;
       taxDeduction = grossPay * (taxRate / 100);
       totalDeductions = taxDeduction + otherDeductions;
       netPay = grossPay - totalDeductions;
       System.out.println("employee payroll");
       System.out.println("employee name: " + employerName);
       System.out.println("employee id: " + employerID);
       System.out.println("hours worked: " + numberOfHoursWorked);
       System.out.println("hourly rate: " + hourlyRate);
       System.out.println("regular pay: " + regularPay);
       System.out.println("overtime hours: " + overtimeHours);
       System.out.println("overtime rate: " + overtimeRate);
       System.out.println("overtime pay: " + overtimePay);
       System.out.println("gross pay: " + grossPay);
       System.out.println("tax deduction: " + taxDeduction);
       System.out.println("other deductions: " + otherDeductions);
       System.out.println("total deductions: " + totalDeductions);
       System.out.println("net pay: " + netPay);
       System.out.println("end of line");
       input.close();
    }
}
