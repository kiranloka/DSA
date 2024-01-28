import java.util.Arrays;
import java.util.Scanner;

public class kthLargest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scanner.nextInt();
        int[] array=new int[size];

        System.out.println("Enter the elments of the array: ");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the kth element: ");
        int k=scanner.nextInt();

        int result=findkthLargest(array,k);
        System.out.println("the "+k+"th largest element in the array is: "+result);
        scanner.close();
    }
    private static int  findkthLargest(int[] array,int k){
        Arrays.sort(array);
        int n=array.length;

        return array[n-k];
    }
    
}
