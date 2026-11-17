public class L1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int maxT = k * threshold;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if(sum >= maxT){
            count++;
        }
        for(int i = k; i < arr.length; i++){
            sum += arr[i];
            sum -= arr[i-k];
            if(sum >= maxT){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}
