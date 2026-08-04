public class ExampleArray {
    public static void main(String[] args) {
        
    
    int[] arr = {15, 40, 10, 60, 25};
    int highest=arr[0];
    int lowest=arr[0];
     int sum=arr[0];

    for(int i=1;i<arr.length;i++){
        if(arr[i]>highest){
            highest=arr[i];
        }
        if(arr[i]<lowest){
            lowest=arr[i];
        }
         sum+=arr[i];
    }
    int result=highest-lowest;
    int average=sum/arr.length;
    System.out.println("Highest marks is :"+highest);
    System.out.println("Lowest marks is :"+lowest);
    System.out.println("Difference is :"+result);
    System.out.println("Avwrage is :"+average);
    
}}
