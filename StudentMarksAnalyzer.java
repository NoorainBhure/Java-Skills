
import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many subjects you have :");
        int subject=sc.nextInt();
        if(subject<=0){
            System.out.println("Invalid number of subjects");
        }else{
            
         int total=0;
        int highest=0;
        double average=0;
        int marks=0;
        
       

        for(int i=1;i<=subject;i++){
            System.out.println("Enter the Marks :");
             marks=sc.nextInt();

            total=total+marks;
            

            if(marks>highest){
            highest=marks;
         
           
        }
       
            
    } 
    average= (double)total/subject;
    System.out.println("Total :"+total);
        System.out.println("Average :"+average);                     System.out.println("Highest :"+highest);
            
    }
    sc.close();


    
}
}
