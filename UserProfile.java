import java.lang.foreign.ValueLayout;
import java.util.Scanner;
public class UserProfile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name ");
        String name=sc.nextLine();
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        System.out.println("Enter the Graduation Percentage");
        double percentage=sc.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
        
    }
    
}
