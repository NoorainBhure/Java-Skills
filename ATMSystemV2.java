
import java.util.Scanner;

public class ATMSystemV2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance = 10000.0;
        int choice = 0;

        
       

        while (choice!=4) {
             System.out.println("1 → Check Balance");
        System.out.println("2 → Deposit Money");
        System.out.println("3 → Withdraw Money");
        System.out.println("4 → Exit");

        System.out.println("Enter the choice :");
        choice=sc.nextInt();

            switch(choice){

                case 1:
                System.out.println("Your Balance :"+balance);
               
                break;
                

            case 2:
             System.out.println("Enter the deposit Amount :");
                double deposit=sc.nextDouble();
                
            if(deposit>0){
               
                balance=balance+deposit;
                System.out.println("Your Amount is :"+balance);

            }else{
                System.out.println("Your Amount is :"+balance);
            } 
            
            break;


            case 3:
            System.out.println("Withdraw Amount :");
            double withdraw=sc.nextDouble();
           
            if(withdraw <= 0  ){
             System.out.println(" Invalid withdrawal amount :");

            }else if(withdraw > balance ){
                System.out.println("Insufficient balance");
             
            } else  {
             balance=balance-withdraw;
            System.out.println("Your Balance :"+balance);     
            }  
           
            
                break;

                case 4:
                System.out.println("Exit ");
                break;


            default:
                System.out.println("Invalid Choice :");
        }
        
    }
    sc.close();
}}
