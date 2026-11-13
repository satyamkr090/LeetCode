import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L187 {
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i <= s.length()-10; i++) {
            String dna = s.substring(i, i+10);
            if(seen.contains(dna)){
                result.add(dna);
            }
            seen.add(dna);
        }
        return new ArrayList<String>(result);
    }
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
}
