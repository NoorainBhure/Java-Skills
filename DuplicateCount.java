public class DuplicateCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};
        int count=0;
       
        for(int i=0;i<arr.length;i++){
             boolean dup=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup=true;
                    break;
                  
                }
            }
             if(dup){
              count++;
        
        }
        }
       
        System.out.println("Duplicate value count= "+count);
    }
    
}
