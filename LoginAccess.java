import java.util.Scanner;
public class LoginAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Password");
        boolean hasPassword=sc.nextBoolean();
         
        System.out.println("OTP");
        boolean hasOtp=sc.nextBoolean();

        if(hasOtp || hasPassword){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }

    }
    
}
