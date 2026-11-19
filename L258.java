public class L258 {
    public static int addDigits(int num) {    
        if (num == 0) {
            return 0;
        }

        return 1 + (num - 1) % 9;
    }
    public static void main(String[] args) {
        int num = 890;
        System.out.println(addDigits(num));
    }
}
