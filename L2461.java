import java.util.HashSet;
import java.util.Set;

public class L2461 {
    public static long maximumSubarraySum(int[] nums, int k) {

        // long max = 0;
        // long sum = 0;
        // int n = nums.length;
        // for(int i = 0; i <= n - k; i++){
        //     Set<Integer> set = new HashSet<>();
        //     boolean isDup = false;
            
        //     sum = 0;
                                                            //time_limit_exceed - O(n^2)
        //     for(int j = i; j <= i+k-1; j++){
        //         if(set.contains(nums[j])){
        //             isDup = true;
        //             break;
        //         }
        //         set.add(nums[j]);
        //         sum = sum + nums[j];
        //     }
        //     if(!isDup){
        //         max = Math.max(max, sum);
        //     }
        // }
        //return max;

        long sum = 0;
        long max = 0;
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0 ;
        while (j < nums.length) {
            while(set.contains(nums[j])){
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            sum += nums[j];
            set.add(nums[j]);
            if(j-i+1 == k){
                max = Math.max(sum, max);
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
}
