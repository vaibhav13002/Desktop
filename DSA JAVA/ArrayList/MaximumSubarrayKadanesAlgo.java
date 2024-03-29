package ArrayList;
public class MaximumSubarrayKadanesAlgo {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, -1, 2, 1, -5};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
        public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // isme maximum possible minimum value store h so that sum kuch bhi aaye o issey bada ho....
        //agr isko zero rkha tho subarray ka sum  negative bhi ja skta h.
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
}
