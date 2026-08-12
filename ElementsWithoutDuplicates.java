public class ElementsWithoutDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 20, 30, 40};
        int[] arr2 = {20, 20, 40, 50};
        for(int i=0;i<arr1.length;i++){
            boolean found=false;
            boolean alreadyProcessed = false;
            for(int j=0;j<i;j++){
                if(arr1[i]==arr1[j]){
                   alreadyProcessed=true;
                    break;
                }
            }
            
            if(!alreadyProcessed){
                for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
        }
        if(found){
            System.out.println(arr1[i]);
        }

        }

    }
    
}
