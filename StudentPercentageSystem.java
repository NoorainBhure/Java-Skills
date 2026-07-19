
import java.util.Scanner;

public class StudentPercentageSystem {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Student Name :");
        String name=sc.nextLine();

        System.out.println("Marks of first subject out of 100 :");
        int marks=sc.nextInt();
        
        System.out.println("Marks of Second subject out of 100 :");
        int marks2=sc.nextInt();

        System.out.println("Marks of Third subject out of 100 :");
        int marks3=sc.nextInt();

        System.out.println("Marks of Fourth subject out of 100 :");
        int marks4=sc.nextInt();

        System.out.println("Marks of Fifth subject out of 100 :");
        int marks5=sc.nextInt();

        int totalMarks=(marks+marks2+marks3+marks4+marks5);

        System.out.println("Your total marks is :"+totalMarks);

        double percentage=((double)totalMarks/500)*100;
        System.out.println("Your Percentage is :"+percentage);

        if(percentage>=75){
            System.out.println("Distinction");

         } else if(percentage>=60){
            System.out.println("First Class");
          } else if(percentage>=50){
            System.out.println("Second Class");
           } else if(percentage>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        sc.close();
    }


}
