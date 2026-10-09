public class L1541 {
    public static int minInsertions(String s) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    result++;
                }

                if (count > 0) {
                    count--;
                } else {
                    result++;
                }
            }
        }
        return result + count * 2;
    }
    public static void main(String[] args) {
        String s = "))(())";
        System.out.println(minInsertions(s));
    }
}
