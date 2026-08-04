public class ArrayMiniProject {
    public static void main(String[] args) {
        int[] arr = {15, 40, 10, 60, 25, -5, 0, 80};
        int highest=arr[0];
        int lowest=arr[0];
        int sum=0;
        double average;
        int difference;
        int even=0;
        int odd=0;
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }

             if(arr[i]<lowest){
                lowest=arr[i];
            }
            sum+=arr[i];
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
             if(arr[i]>0){
                positive++;
            }else if(arr[i]<0){
                negative++;
            }else{
                zero++;
            }

           


        }

        System.out.println("Highest ="+highest);
        System.out.println("Lowest ="+lowest);
        System.out.println("Sum ="+sum);
        average=(double)sum/arr.length;
        System.out.println("Average ="+average);
        difference=highest-lowest;
        System.out.println("Difference =" + difference);
        System.out.println("Even count ="+even);
        System.out.println("Odd count ="+odd);
        System.out.println("Positive count ="+positive);
        System.out.println("Negative count ="+negative);
        System.out.println("Zero count ="+zero);

    }
    
}
