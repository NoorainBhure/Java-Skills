
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String name=sc.nextLine();
        System.out.println("Enter the Employee Salary");
        int salary=sc.nextInt();
        int annualSalary=12*salary;
        double percentage=20;
        double monthlySaving=(salary*percentage)/100;
        System.out.println(annualSalary);
        System.out.println(monthlySaving);
    }
    
}
