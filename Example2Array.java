public class Example2Array {
    public static void main(String[] args) {
        int[] arr = {15, 40, 10, 60, 25};
      
       
          String even="Even numbers \n";
          String odd="Odd numbers \n";
          
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even=even+arr[i]+"\n";
             
            }
                 else {
                    odd=odd+arr[i]+"\n";
               
            }

        }
       System.out.println(even);
       System.out.println(odd);
    
        
    }
}
