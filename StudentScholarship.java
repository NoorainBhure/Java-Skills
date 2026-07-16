
import java.util.Scanner;

public class StudentScholarship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the merks ");
        int marks=sc.nextInt();

        if(marks>=50){
            System.out.println("You passed ");
            if(marks>=80){
                System.out.println("Eligiblr for Scholarship");
            }
            else{
                System.out.println("Not eligible for scholarship");
            }
        }else{
            System.out.println("You Failed");
        }
    }
    
}
