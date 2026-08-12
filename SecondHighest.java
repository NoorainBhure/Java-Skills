public class SecondHighest{
public static void main(String[] args) {
int[] arr = {10, 40, 20, 80, 60};
int highest=arr[0];
int secondHighest=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]>highest){
        secondHighest=highest;
        highest=arr[i];
    }
       else if(arr[i]>secondHighest ){
            secondHighest=arr[i];
        
    }
}
System.out.println("Highest: "+highest);
System.out.println("SecondHighest: "+secondHighest);
}
}