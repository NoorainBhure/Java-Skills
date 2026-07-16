import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Java Marks");
        int java=sc.nextInt();
        System.out.println("Enter the SQL marks");
        int SQL=sc.nextInt();
        int additon=java+SQL;
        System.out.println("Total Marks "+additon);
    }
    
}
