public class ReverseArray {

    public static void reverseArray(int[] marks){
        int left=0;
        int right=marks.length-1;
        while(left<right){
            int temp=marks[left];
            marks[left]=marks[right];
            marks[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] marks={10,20,30,40,50};
        reverseArray(marks);
        for(int i=0;i<marks.length;i++){
         
           System.out.print(marks[i]+" ");
        }
       
    }
    
}
