public class TwoArrayComparison {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 300, 40};
        boolean found=false;
                if(arr1.length!=arr2.length ){
                    found=true;
                    
                }else{
                    for(int i=0;i<arr1.length;i++){
                        if(arr1[i]!=arr2[i]){
                            found =true;
                            break;
                        }
                    }
                }
            
        
        if(found){
                    System.out.println("Arrays are not equals");
                }else{
                    System.out.println("Arrays are equal");
    }

    
    }}