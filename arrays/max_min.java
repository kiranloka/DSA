public class max_min {

    public static void main(String[] args) {
        int[] array = {4, 2, 9, 5, 1, 7, 6, 8, 3};

        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    // Function to find the maximum element in the array
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Function to find the minimum element in the array
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
