public class L2723 {
    public static String maxSumOfSquares(int num, int sum) {
        if (sum < 0 || sum > num * 9) {
        return "";
        };

        char[] result = new char[num];
        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            result[i] = (char) ('0' + digit);
            sum -= digit;
        }
        return new String(result);

        // StringBuilder result = new StringBuilder();
        // for (int i = 0; i < num; i++) {
        //     int digit = Math.min(9, sum);
        //     result.append(digit);
        //     sum -= digit;
        // }
        // return result.toString();
    }
    public static void main(String[] args) {
        int num = 5;
        int sum = 20;
        System.out.println(maxSumOfSquares(num, sum));
    }
}
