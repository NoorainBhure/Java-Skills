import java.util.Scanner;
public class FoodMenu {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Menu Choice :");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Burger");
                break;
            case 2:
            System.out.println("Pizza");
            break;
            case 3:
            System.out.println("Sandwich");
            break;
            default:
                System.out.println("Invalid Choice ");
                
        }

sc.close();
        
    }
    
}
