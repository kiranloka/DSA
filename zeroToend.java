public class zeroToend {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, 0, 3, 0, 7, 9, 0, 2};

        System.out.println("Original Array: ");
        printArray(array);

        moveZerosToEnd(array);

        System.out.println("\nArray after moving zeros to the end: ");
        printArray(array);
    }

    static void moveZerosToEnd(int[] array){
        int nonZeroIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[nonZeroIndex]=array[i];
                nonZeroIndex++;
            }
        }

        for(int j=nonZeroIndex;j<array.length;j++){
            array[j]=0;
        }
              
        
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
