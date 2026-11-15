import java.util.HashSet;
import java.util.Set;

public class L904 {
    public static int totalFruit(int[] fruits) {
        int max = 0;
        for(int i=0; i<fruits.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<fruits.length; j++){
                set.add(fruits[j]);
                if(set.size() > 2){
                    break;
                }
                max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
        System.out.println(totalFruit(fruits));
    }
}
