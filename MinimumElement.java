public class MinimumElement{
    public static void main(String[] args) {
         int[] arr = {75, 92, 68, 89, 95};
        int lowest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<lowest){
                lowest=arr[i];
            }
        }
        System.out.println(lowest);

    }
}