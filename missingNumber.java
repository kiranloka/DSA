public class missingNumber {
    public static void main(String[] args) {
        int[] array={1,2,3,5,6};
        int n=array.length+1;

        int missingNumber=findMissingNumber(array,n);
        System.out.println("the missing element is "+missingNumber);

    }
    private static int findMissingNumber(int[] array,int n){
        int expectedSum=n*(n+1)/2;
        int actualSum=0;

        for(int num:array){
            actualSum+=num;
        }
        
        return expectedSum-actualSum;

    }
    
}
