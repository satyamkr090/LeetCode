package GfG;

public class sumSubarray {
    public static int maxSubarraySum(int[] arr, int k) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < k ; i++){
            sum = sum + arr[i];
        }
        max = Math.max(max, sum);
        for(int i = k; i < arr.length; i++){
            sum = sum + arr[i];
            sum = sum - arr[i-k];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSubarraySum(arr, k));
    }
}
