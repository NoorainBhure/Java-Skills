
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Student Name ");
        String name=sc.nextLine();

        System.out.println("Enter the Java Marks ");
        int marks=sc.nextInt();

        System.out.println("Enter teh Sql marks ");
        int sql=sc.nextInt();

        System.out.println("Enter the English Marks ");
        int english=sc.nextInt();

        int total=marks+sql+english;

        int average=total/3;

        System.out.println("Your Progress Card :");
        
        System.out.println("Java Marks :"+marks);

        System.out.println("SQL Marks :"+sql);

        System.out.println("English Marks :"+english);

        System.out.println("Total Marks :"+total);

        System.out.println("Average :"+average);

        

        if(average>=75){
            System.out.println("Grade :A Grade");
        }
        else if(average>=60){
            System.out.println("Grade : B Grade");
        }
        else if(average>=50){
            System.out.println("Grade :Grade C");
        }
        else{
            System.out.println("Grade :Fail");
        }

    }
    
}
