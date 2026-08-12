public class ActualDup {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};

        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(arr[i]);
            }

        }
    }
    
}
