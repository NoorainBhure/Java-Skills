
import java.util.Scanner;

public class SmartJobScreening {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Age");
        int age=sc.nextInt();

        System.out.println("CGPA");
        double cgpa=sc.nextDouble();

        System.out.println("Apptitude");
        int apptitude=sc.nextInt();

        System.out.println("hasJAvaSkills");
        boolean hasJavaSkills=sc.nextBoolean();

        System.out.println("hasPythonSkills");
        boolean hasPythonSkills=sc.nextBoolean();

        System.out.println("hasInternshipExperience");
        boolean hasInternshipExperience=sc.nextBoolean();

       if(age>=21 && cgpa>=7.0){
        if(hasJavaSkills || hasPythonSkills){
            if(apptitude>=70 || hasInternshipExperience){
                System.out.println("Selected for technical interview");
            }
            else{
                System.out.println("Not selected: aptitude/experience requirement failed");
            }
        }
        else{
            System.out.println("Not selected: programming skills required");
        }
       }else{
        System.out.println("Not selected: basic requirements failed");
       }
    }
}
