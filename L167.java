public class L167 {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum > target){
                j--;
            } else if(sum < target){
                i++;
            } else {
                return new int[] {i+1, j+1};
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
