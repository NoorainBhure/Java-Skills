
import java.util.Scanner;

public class DoWhileTable {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num=sc.nextInt();


        int i=1;
        do { 
           System.out.println(num+" x "+i+" = "+(num*i));
           i++; 
        } while (i<=10);
    }
}
