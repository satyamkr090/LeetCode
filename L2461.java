import java.util.HashMap;
import java.util.Map;

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

        long max = 0;
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int dups = 0;
        for(int i=0; i<k; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);

            sum = sum + nums[i];
            
            if(map.get(nums[i]) > 1){
                dups++;
            }
        }
        if(dups == 0){
            max = Math.max(max, sum);
        }
        for(int i = k; i < nums.length; i++){
            int numsToAdd = nums[i], 
                numsToRemove = nums[i - k];
            if(!map.containsKey(numsToAdd)){
                map.put(numsToAdd, 0);
            }
            map.put(numsToAdd, map.get(numsToAdd) + 1);
            if(map.get(numsToAdd) > 1){
                dups++;
            }
            sum = sum + numsToAdd;

            if(map.get(numsToRemove) > 1){
                dups--;
            }
            map.put(numsToRemove, map.get(numsToRemove) - 1);
            sum = sum - numsToRemove;
            if(dups == 0){
                max = Math.max(sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
}
