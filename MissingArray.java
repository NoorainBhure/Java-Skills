public class MissingArray {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int expectedSum=0;
        int actualsum =0;
        for(int i=1;i<=arr.length+1;i++){
            expectedSum +=i;
        }
        for(int i=0;i<arr.length;i++){
            actualsum +=arr[i];

        }  
        int missing=expectedSum-actualsum;
        System.out.println(missing);
    
    }
    
}
