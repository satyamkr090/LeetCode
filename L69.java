public class L69 {
    public static int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}
