import java.util.Scanner;
public class EmployeeHiringSystem {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name=sc.nextLine();

        System.out.println("Enter your Age");
        int age=sc.nextInt();

        System.out.println("Enter your CGPA");
        double cgpa=sc.nextDouble();

        System.out.println("Enter your Apptitude Score");
        int apptitude=sc.nextInt();
        
        System.out.println("Has JavaSkills ? true/false");
        boolean hasJavaSkill=sc.nextBoolean();

        System.out.println("Has PythonSkills ? true/false");
        boolean hasPythonSkill=sc.nextBoolean();

        if(age>=21 && cgpa>=7.0){
            if(hasJavaSkill || hasPythonSkill){
                if(apptitude>=70){
                    System.out.println(name+"Selected for interview");
                }else{
                    System.out.println(name+"Rejected: aptitude requirement not met");
                }
            }else{
                System.out.println(name+"Rejected: programming skills required");
            }
        }else{
            System.out.println(name+"Rejected: basic eligibility not met");
        }


    }
}
