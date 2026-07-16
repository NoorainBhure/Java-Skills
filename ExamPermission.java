
import java.util.Scanner;

public class ExamPermission {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("hasHallTicket");
        boolean hasHallTicket=sc.nextBoolean();

        
        System.out.println("hasSpecialPermission");
        boolean hasSpecialPermission=sc.nextBoolean();


        if(hasHallTicket || hasSpecialPermission){
            System.out.println("Allowed to enter exam");

        }
        else{
            System.out.println("Not allowed to enter exam");
            
        }

        
    }
    }
    

