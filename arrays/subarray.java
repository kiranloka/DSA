public class subarray{

    static int findMaxSubarraySum(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = max(array[i], maxEndingHere + array[i]);
            maxSoFar = max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubarraySum = findMaxSubarraySum(array);

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum);
    }
}
