import java.util.HashMap;
import java.util.Map;

public class L246 {
    public static boolean isStrobogrammatic( Map<Character, Character> map, String num) {
        int i = 0;
        int j = num.length() - 1;
        while (i <= j) {
            char left = num.charAt(i);
            char right = num.charAt(j);

            if(map.containsKey(left)){
                if(map.get(left) != right){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "168891";

        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        System.out.println(isStrobogrammatic(map, num));
    }
}
