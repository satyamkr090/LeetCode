public class L287 {
    public static int findDuplicate(int[] nums) {
                //approach1
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     if(set.contains(num)){
        //         return num;
        //     }
        //     set.add(num);
        // }
        // return -1;

                //Approach2
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }while(slow != fast);

        int n1 = 0,
            n2 = slow;
        while (n1 != n2) {
            n1 = nums[n1];
            n2 = nums[n2];
        }
        return n1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
