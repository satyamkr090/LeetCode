import java.util.Arrays;

public class L3727 {
    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);

        long ans = 0;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            ans -= nums[i];
        }

        for (int i = mid; i < n; i++) {
            ans += nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,-1,2,-2,3,-3};
        System.out.println(maxAlternatingSum(num));
    }
}
