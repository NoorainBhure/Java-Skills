
import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         double balance = 10000.0;
        
        int choice;
        double deposite,withdraw;

        do { 
            System.out.println("1 → Check Balance");
            System.out.println("2 → Deposit");
            System.out.println("3 → Withdraw");
            System.out.println("4 → Exit");
            System.out.println("Enter your choice ");
            choice=sc.nextInt();



            switch(choice){
                case 1:
                System.out.println("check Balance "+balance);
                break;

                case 2:
                System.out.println("Enter the deposite amount ");
                deposite=sc.nextDouble();
                if(deposite>0){
                    balance=balance+deposite;
                    System.out.println("Your Balance is "+balance);

                }else{
                    System.out.println("Invalid deposite ");
                }

                break;

                case 3:
                System.out.println("Enter the widthdraw amount ");
                withdraw=sc.nextDouble();
                if(withdraw>balance){
                    System.out.println("Insufficient balance ");
                }else if(withdraw<=0){

                    System.out.println("Amount should be greater tha zero ");
                }else{
                    balance=balance-withdraw;
                    System.out.println("You Current balance is "+balance);
                }

                break;

                case 4:
                System.out.println("Exit ");

                break;

                default:
                System.out.println("Invalid Choice ");
            }

        } while (choice!=4);
        sc.close();

    }

    
}
