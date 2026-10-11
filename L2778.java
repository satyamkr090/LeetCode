public class L2778 {
    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(n % (i+1) == 0){
                sum += nums[i]*nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));
    }
}
