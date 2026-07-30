public class MaximumElement {
    public static void main(String[] args) {

        int[] arr = {75, 92, 68, 89, 95};

        int highest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }
        System.out.println(highest);

      

    }
}
        
    
