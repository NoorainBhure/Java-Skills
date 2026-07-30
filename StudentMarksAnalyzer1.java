public class StudentMarksAnalyzer1 {
    public static void main(String[] args) {
        int[] marks = {75, 92, 68, 89, 95, 92, 75};
        int[] copyMarks=new int[marks.length];
        
        int highest=marks[0];
        int target=92;
        int count=0;
        boolean result=true;

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            copyMarks[i]=marks[i];
            if(marks[i]>highest){
                highest=marks[i];
            }
            if(marks[i]==target){
                count++;
            }

           
        }
        System.out.println("Highest marks :"+highest);
        System.out.println("Number of 92 appear :"+count);


        if(marks.length != copyMarks.length){
    result = false;
    return;
}

        for(int i=0;i<marks.length;i++){
            if(marks[i]!=copyMarks[i] ){
                result=false;
                break;
            }
        }
        if(result){
    System.out.println("Arrays are equal");
}else{
    System.out.println("Arrays are not equal");
}
        
    }
    
}
