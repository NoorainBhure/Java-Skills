public class DrivingEligibility {
    public static void main(String[] args) {
        int age=16;
        boolean hasLicense=false;
        if (age >=18) {
            System.out.println("Age requirement passed");
            if(hasLicense){
                System.out.println("You can Drive");
            }
            else{
               System.out.println("You cannot drive without a license");
        }
        }
    }
    
}
