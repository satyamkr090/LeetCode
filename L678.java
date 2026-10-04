
public class L678 {
    public static boolean checkValidString(String s) {

        // Stack<Integer> open = new Stack<>();
        // Stack<Integer> star = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (ch == '(') {
        //         open.push(i);
        //     }
        //     else if (ch == '*') {
        //         star.push(i);
        //     }
        //     else { 
        //         if (!open.isEmpty()) {
        //             open.pop();
        //         }
        //         else if (!star.isEmpty()) {
        //             star.pop();
        //         }
        //         else {
        //             return false;
        //         }
        //     }
        // }
        // while (!open.isEmpty() && !star.isEmpty()) {
        //     if (open.peek() < star.peek()) {
        //         open.pop();
        //         star.pop();
        //     }
        //     else {
        //         return false;
        //     }
        // }
        // return open.isEmpty();

                //Approach2 
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                min++;
                max++;
            } 
            else if (ch == ')') {
                min--;
                max--;
            } 
            else {
                min--;
                max++;
            }
            if (max < 0) {
                return false;
            }
            if (min < 0) {
                min = 0;
            }
        }
        return min == 0;
    }
    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(checkValidString(s));
    }
}