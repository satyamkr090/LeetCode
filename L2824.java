import java.util.*;

public class L2824 {
    public static  int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        
        int i = 0;
        int j = nums.size()-1;
        int count = 0;
        while (i<j) {
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                count=count+(j-i);
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        System.out.println(countPairs(nums, target));
    }
}
