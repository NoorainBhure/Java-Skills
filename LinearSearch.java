public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {15, 40, 10, 60, 25};
        int index=-1;

        int target = 10;
        boolean found = false;
        for( int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;

            }
        }
        if(found){
            System.out.println("Element Found at index :"+index);
        }else{
            System.out.println("Element Not Found");
        }
    }
    
}
