
import java.util.Scanner;

public class PlacementEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("CGPA");
        double cgpa=sc.nextDouble();

        System.out.println("Backlogs");
        int backlogs=sc.nextInt();

        System.out.println("HasJavaSkills?(Truw/False)");
        boolean hasJAvaSkills=sc.nextBoolean();

        if(cgpa>=7.0 && backlogs==0 && hasJAvaSkills){
            System.out.println("Eligible for placement");
        } 
        else{
            System.out.println("Not eligible for placemnet");
        }
    }
    
}
