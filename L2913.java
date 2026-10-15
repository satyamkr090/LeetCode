
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L2913 {
    public static int sumCounts(List<Integer> nums) {
        int sum = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int count = set.size();
                sum += count * count;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 1);
        int result = sumCounts(nums);
        System.out.println(result);
    }
}
