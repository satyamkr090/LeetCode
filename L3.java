import java.util.HashSet;
import java.util.Set;
public class L3 {
    public static int lengthOfLongestSubstring(String s) {
        // int max = 0;
        // for(int i = 0 ; i < s.length(); i++){
        //     Set<Character> set = new HashSet<>();
        //     for(int j = i; j < s.length();j++){
        //         char c = s.charAt(j);
        //         if(set.contains(c)){
        //             break;
        //         }
        //         set.add(c);
        //         max = Math.max(max, j-i+1);
        //     }
        // }
        // return max;

        int max = 0;
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
