
import java.util.Scanner;

public class CustomCounter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the starting number :");
        int startingNumber=sc.nextInt();
        
        System.out.println("Enter the Ending number :");
        int endingNumber=sc.nextInt();
        

        while(startingNumber<=endingNumber){
            System.out.println(startingNumber);
            startingNumber++;
        }
        sc.close();
    }
}