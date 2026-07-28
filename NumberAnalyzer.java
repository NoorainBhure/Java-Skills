
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the one positive number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%3==0){
            System.out.println(i);
            
             sum=sum+i;
            }
           
        }
        System.out.println(sum);
        sc.close();
    }
    
}
