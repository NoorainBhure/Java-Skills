public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] arr = {15, 40, 10, 60, 25, 80, 20};
        int highest=arr[0];
        int lowest=arr[0];
        int even=0;
        int odd=0;
        int left=0;
        int right=arr.length-1;
        boolean checkSorted=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
            if(arr[i]<lowest){
                lowest=arr[i];
            }

            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
         
        }

System.out.println("Highest ="+highest);
System.out.println("Lowest ="+lowest);
System.out.println("Even Count ="+even);
System.out.println("Odd Count ="+odd);


for(int i=1;i<arr.length;i++){
 if(arr[i]<arr[i-1]){
                checkSorted=false;
                break;}
                
            }

    System.out.println("Sorted ="+checkSorted);


         
            
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
               
    }
     for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
}
}