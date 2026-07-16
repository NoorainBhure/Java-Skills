import java.util.Scanner;
public class InterviewEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Graduation Percentage");
        int percentage=sc.nextInt();

        System.out.println("Apptitude Score");
        int score=sc.nextInt();

        System.out.println("hasJavaKnowledge (True/False)");
        boolean hasJavaKnowledge=sc.nextBoolean();

        if(percentage>=60 && score>=70 && hasJavaKnowledge){
            
                System.out.println("Eligible for interview");
            
        }
    }
    
}
