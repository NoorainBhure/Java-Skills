
import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int choice=0;
        int num,num2;
        do { 
             System.out.println("1 → Addition");
             System.out.println("2 → Subtraction");
             System.out.println("3 → Multiplication");
             System.out.println("4 → Exit");

             System.out.println("Enter the Choice :");
             choice=sc.nextInt();

             switch(choice){
                case 1:
                System.out.println("Enter the first number ");
                num=sc.nextInt();
                
                System.out.println("Enter the Second number ");
                num2=sc.nextInt();

                int result=num+num2;
                System.out.println("Addition is "+result);
                break;

                case 2:
                 System.out.println("Enter the first number ");
                 num=sc.nextInt();
                
                System.out.println("Enter the Second number ");
                num2=sc.nextInt();

                result=num-num2;
                System.out.println("Subtraction is "+result);
                break;

                case 3:
                 System.out.println("Enter the first number ");
                 num=sc.nextInt();
                
                System.out.println("Enter the Second number ");
                num2=sc.nextInt();

                result=num*num2;
                System.out.println("Multiplication is "+result);
                break;

                case 4:
                System.out.println("Exit");
                break;
                default:
                System.out.println("Invalid choice");
             }

        } while (choice!=4);
        sc.close();
    }
    
}
