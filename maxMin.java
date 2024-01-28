import java.util.Arrays;
public class maxMin {
    public static void main(String[] args) {
        int[] array={1,3,3,54,6,7};
        Arrays.sort(array);
        int n=array.length;

        System.out.println("Minimum number in the array: "+array[0]);
        System.out.println("Maximum number in the array: "+array[n]);


    }
    
    
}
