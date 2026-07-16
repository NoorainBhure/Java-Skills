import java.util.Scanner;
public class CompanyHiring {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Age");
    int age=sc.nextInt();

    System.out.println("CGPA");
    double cgpa=sc.nextDouble();

    System.out.println("Apptitude");
    int appti=sc.nextInt();

    System.out.println("hasJavaSkilss(True/False)");
    boolean hasJAvaSkills=sc.nextBoolean();

    if(age>=21 && cgpa>=7.5 && appti>70 && hasJAvaSkills){
        System.out.println("Selected for interview");
    }else{
        System.out.println("Not selected for interview");
    }
    }

}
