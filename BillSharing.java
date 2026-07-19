
import java.util.Scanner;

public class BillSharing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Total Bill");
        int totalBill=sc.nextInt();

        System.out.println("Number of People");
        int numberOfPeople=sc.nextInt();

        double amountPerPerson=(double)totalBill/numberOfPeople;

        System.out.println(amountPerPerson);
        sc.close();
    }
    
}
