public class L643 {
    public static double findMaxAverage(int[] nums, int k) {
        // double max = Integer.MIN_VALUE;
        // for (int i = 0; i <= nums.length - k; i++) {
        //     double sum = 0;
        //     for (int j = i; j < i + k; j++) {
        //         sum += nums[j];
        //     }
        //     max = Math.max(max, sum);
        // }
        // return max / k;
        
        double max = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i-k];
            max = Math.max(max, sum);
        }
        return max / k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
