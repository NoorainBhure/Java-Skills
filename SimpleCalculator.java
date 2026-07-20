
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number :");
        double first=sc.nextDouble();
        
        System.out.println("Enter Second Number :");
        double second=sc.nextDouble();
        
        System.out.println("Enter Your Choice :");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
            double add=first+second;
            System.out.println("Addition "+add);
            break;
             case 2:
              double subtract=first-second;
            System.out.println("Subtraction "+subtract);
            break; 
            case 3:
            double multiply=first*second;
            System.out.println("Multiplication "+multiply);
            break;
            case 4:
            
             if (second==0) {
                System.out.println("Cannot divide by zero");
                
            }else{
                double division=first/second;
            System.out.println("Division "+division);
            }
            break;
            default:
            System.out.println("Invalid Choice ");
        }

        sc.close();
       
        

       
        
    }
    
}
