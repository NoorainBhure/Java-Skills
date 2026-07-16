
import java.util.Scanner;

public class JobEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Age ");
         int age=sc.nextInt();

         System.out.println("Enter the GRaduation Percentage ");
         int percentage=sc.nextInt();

         System.out.println("You have Java Knowledge? (True/False) ");
         boolean java=sc.nextBoolean();

         if(age>=21 ){
            if(percentage>=60){
                  if(java){
                System.out.println("Candidate is eligible for the interview.");
                

            }
            else{
                System.out.println("Candidate meets age and education requirements but needs Java knowledge.");
            }
         }else{
            System.out.println("Candidate meets the age requirement but does not meet the education requirement.");
         }
    }else{
        System.out.println("Candidate does not meet the age requirement.");
    }
    
}
}