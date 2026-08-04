public class Example3Array {
    public static void main(String[] args) {
        int[] arr = {5, -2, 0, 8, -1, 0, 7};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println("Positive number \n"+positive);
        System.out.println("Negative number \n"+negative);
        System.out.println("Zeros are \n"+zero);
    }
    
}
