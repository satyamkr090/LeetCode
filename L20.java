import java.util.Stack;

public class L20 {
    public static boolean isValid(String s) {
        Stack <Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else{
                if(stk.isEmpty()){
                    return false;
                }

                char top = stk.peek();
                if(ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '['){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({}([]))";
        System.out.println(isValid(s));
    }
}
