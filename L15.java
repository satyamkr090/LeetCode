import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15 {
    public static void twoSumHelper(int f, int[] nums, List<List<Integer>> res){
        int i = f + 1;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[f] + nums[i] + nums[j];

            if(sum > 0){
                j--;
            } else if(sum < 0){
                i++;
            }else {
                res.add(Arrays.asList(nums[f], nums[i], nums[j]));
                i++;
                j--;

                while (i < j && nums[i] == nums[i-1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j+1]) {
                    j--;
                }
            }
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int f = 0; f<nums.length; f++){
            if(nums[f] > 0){
                break;
            }
            if(f==0 || nums[f] != nums[f-1]){
                twoSumHelper(f, nums, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
