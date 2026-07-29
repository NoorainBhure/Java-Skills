public class Array4 {
    public static void main(String[] args) {

      int[] arr = {80, 80, 60, 40};
        int highest=arr[0];
        int secondhighest= Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>highest){
                secondhighest= highest;
                highest=arr[i];}
           else if( arr[i]>secondhighest && arr[i]< highest){
                secondhighest=arr[i];
            } 

                }
            
            System.out.println(secondhighest);
        }
        
    }
    

