public class CompareArrays {
    public static void main(String[] args) {
        
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};
        boolean result=true;

        if(arr1.length!=arr2.length){
            System.out.println("Array are not equal ");
            return;
            
        }
    
        for(int i=0;i<arr1.length;i++){
            
                if(arr1[i]!=arr2[i]){
             result=false;
            break;
            
        }
    
       
        }
      if(result){
        System.out.println("Arrays are equal.");}
        else{
         System.out.println("Arrays are not equal.");}
    }
    
}
