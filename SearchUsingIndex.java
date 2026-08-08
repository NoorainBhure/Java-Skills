public class SearchUsingIndex {
    public static void main(String[] args) {
        int index=-1;
        int[] arr = {15, 40, 10, 60, 25};
        int target = 60;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found :");
        }else{
            System.out.println("Element is founded at index at :"+index);
            System.out.println("Element :"+arr[index]);
        }
    }
}
