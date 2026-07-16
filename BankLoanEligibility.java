
import java.util.Scanner;

public class BankLoanEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the Age ");
        int age=sc.nextInt();

        System.out.println("Enter your Monthly income ");
        int salary=sc.nextInt();

        System.out.println(age);
        System.out.println(salary);

        if(age>=21){
            if(salary>=25000){
                System.out.println("Eligible For Loan ");
            }else{
                System.out.println("Age requirement passed, but income is too low");
            }
        }else{
            System.out.println("Not eligible because of age");
        }


    }
    
}
