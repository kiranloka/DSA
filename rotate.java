public class rotate {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int k=2;

        System.out.println("Original array= ");
        printArray(arr);

        rotateArray(arr,k);

        System.out.println("Array after rotating by "+k+" steps");
        printArray(arr);
    }
    private static void reverseArray(int[] arr,int start,int end){
        while(start<end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
        }
    }
    private static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0, k-1);
        reverseArray(arr, k, n-1);


    }
    private static void printArray(int[] arr){
        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
