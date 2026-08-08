public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int target = 20;
        int target2=100;
        int count=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }

            if(arr[i]==target2){
                count2++;
            }
        }
        System.out.println(target+" appear "+count);
          System.out.println(target2+" appear "+count2);
    }
    
}
