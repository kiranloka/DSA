public class reverseArray {
    public static void main(String[] args){
        int[] arr={1,4,3,5,2};
        System.out.println("Original array: ");
        int n=arr.length;
        
        printArray(arr);
        reverse(arr,0,n-1);
        System.out.println("Array after reversing: ");
        printArray(arr);
    }
    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    private static void printArray(int[] arr){
        for(int value:arr){
            System.out.print(value+" ");

        }
        System.out.println();
    }
    
}
