public class duplicates {
    public static void main(String[] args) {
        int[] array={1,2,3,3,4,5,5};

        findDuplicates(array);
    }
    private static void findDuplicates(int[] array){
        boolean hasDuplicates=false;

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Duplicates found: "+array[i]);
                    hasDuplicates=true;
                    
                }
            }
        }
        if(!hasDuplicates){
            System.out.println("No Duplicates found");
        }
    }
}
