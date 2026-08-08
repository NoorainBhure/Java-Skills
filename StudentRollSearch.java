public class StudentRollSearch {
    public static void main(String[] args) {
        int[] rollNumbers = {101, 105, 103, 105, 109, 101, 105, 110};
        int target = 105;
        int index=-1;
        int count=0;
        int i=0;

        for( i=0;i<rollNumbers.length;i++){
            if(rollNumbers[i]==target){
                 count++;

            if(index==-1){
                index=i;
            }
            }
          
    }

          if(index==-1){
            System.out.println("Roll Number Not Found: ");
              }else{
                System.out.println("Roll Number Found: ");
              }

          if(index!=-1){
            System.out.println("First Found At Index: "+index);
             }

             if(index!=-1){
         System.out.println("Element: "+rollNumbers[index]);
             }
        System.out.println("Occurrences: "+count);
       


    }
    
}
