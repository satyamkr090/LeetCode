public class L151 {
    public static  String reverseWords(String s) {
        String trim = s.trim();
        String[] arr = trim.split("\\s+");
        int i = 0,
            j = arr.length - 1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
