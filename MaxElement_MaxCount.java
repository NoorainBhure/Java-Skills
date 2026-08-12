public class MaxElement_MaxCount{
    public static void main(String[] args) {
       int[] arr = {10, 20, 10, 30, 20,  40};
       int maxCount = 0;
       int maxElement = 0;
        for(int i=0;i<arr.length;i++){
             int target = arr[i];
              int count=0;
              for(int j=0;j<arr.length;j++){
            if(arr[j]==target){
                count++;
            }
        }

    if(count >= maxCount){
    maxCount = count;
    maxElement = target;
}
    }
   System.out.println("Most Frequent Element= "+maxElement);
   System.out.println("Frequency= "+maxCount);

        
    }
}
