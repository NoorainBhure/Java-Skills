public class MiniProjectArray {
    public static void main(String[] args) {
        int [] marks={80,30,40,70,80,50,33,90,60,50};
        int highest=marks[0];
        int lowest=marks[0];
        double average=0;
        int passed=0;
        int failed=0;
        int target=78;
         int sum=0;
        boolean found=false;
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+"  ");
           
            if(marks[i]>highest){
                highest=marks[i];
            }
             if(marks[i]<lowest){
                lowest=marks[i];
            }
           
            sum+=marks[i];
          

            if(marks[i]>=35){
                passed++;
            }else{
                failed++;
            }

            if(marks[i]==target){
                found=true;
                break;
            }
            
        }
          average=(double)sum/marks.length;
            System.out.println();
             System.out.println("Highest marks "+highest);
             System.out.println("Lowest marks "+lowest);
             System.out.println("Average marks "+average);
             System.out.println("Passed student "+passed);
             System.out.println("Failed student "+failed);

             if(found){
                System.out.println("Found ");
             }else{
                System.out.println("Not found");
             }


    }
}
