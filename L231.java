public class L231 {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }

        //division method

        // while (n%2 == 0) {           
        //     n = n/2;
        // }
        // return n == 1;

        //bitwise approach
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        int n = 2048;
        System.out.println(isPowerOfTwo(n));
    }
}
