public class NewArrayWithoutDuplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int [] newArr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                newArr[index]=arr[i];
                index++;
            }
            
        }
        for(int i=0;i<index;i++){
            System.out.println(newArr[i]);
        }
        
    }
    
}
