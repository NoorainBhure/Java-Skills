public class Array3{
    public static void main(String[] args) {
        int[] arr = {15, 80, 45, 100, 20};
        int lowest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<lowest){
                lowest=arr[i];
            }
        }
        System.out.println(lowest);
    }

}