public class L344 {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i<j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);

        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k]);
        } 
    }
}
