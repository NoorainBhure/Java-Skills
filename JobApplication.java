
import java.util.Scanner;

public class JobApplication {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Age");
        int age=sc.nextInt();

        System.out.println("CGPA");
        double cgpa=sc.nextDouble();

        System.out.println("hasJAvaSkills");
        boolean HasJavaSkills=sc.nextBoolean();

             System.out.println("hasPythonSkills");
        boolean HasPythonSkills=sc.nextBoolean();

        if(age>=21 && cgpa>=7.0 && (HasJavaSkills || HasPythonSkills)){
            System.out.println("Selected");
        }
        else{
            System.out.println("Not Selected");
        }
    }
}
