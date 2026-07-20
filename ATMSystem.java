
import java.util.Scanner;


public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double balance=10000.0;
      
        
         System.out.println("1 → Check Balance ");
         System.out.println("2 → Deposit Money ");
         System.out.println("3 → Withdraw Money ");
         System.out.println("4 → Exit");

        System.out.println("Enter your choice :");
        int choice=sc.nextInt();

   
        switch (choice) {
                
            case 1:
    System.out.println("Check balance :" + balance);
    break;
              
                           
               
               

                case 2:

                System.out.println("Deposit Money :");
                double addmoney=sc.nextDouble();
                if(addmoney>0){
                
                balance=balance+addmoney;
                System.out.println("Now your balance is :"+balance);
                }else{
                    System.out.println("Your balance :"+balance);
                }
                
                
                break;

                case 3:
                System.out.println("Withdraw Money :");
              double withdraw=sc.nextDouble();
                if(withdraw<=0){
                    System.out.println("Invalid withdrawal amount");
                }else if (withdraw>balance) {
                    System.out.println("Insufficient balance");
                }else{
                  
                     balance=balance-withdraw;
                     System.out.println("Your Current balance is:"+balance);
                }
                
              
                break;
                
                case 4:
                  System.out.println("Exit:");
               
                break;

        default:
                 System.out.println("Invalid choice");
        }
        
        

        sc.close();
    }

}
