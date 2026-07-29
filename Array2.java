public class Array2 {
    public static void main(String[] args) {
        
        int[] arr = {15, 80, 45, 100, 20};
        int highest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
               highest=arr[i];
            }
        }
         System.out.println(highest);
        
    }
}
