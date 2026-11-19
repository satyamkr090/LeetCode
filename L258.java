public class L258 {
    public static int addDigits(int num) {
        while (num >= 10) {

            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }

            num = sum;
        }
        return num;
    }
    
        //Digital Root (maths optimization)
        // if (num == 0) {
        //     return 0;
        // }
        // return 1 + (num - 1) % 9;
        
    public static void main(String[] args) {
        int num = 826;
        System.out.println(addDigits(num));
    }
}
