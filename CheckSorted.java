public class CheckSorted {
    public static void main(String[] args) {
        int [] arr={10,20,30,25,50};
        boolean sorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
                break;
               
            }
        }if(sorted){
            System.out.println("Arrays are sorted ");

        }else{
            System.out.println("NOt sorted");
        }
    }
    
}
