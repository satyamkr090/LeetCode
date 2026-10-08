public class L2130 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // public static ListNode reverseLL(ListNode curr){
    //     ListNode prev = null;
    //     while(curr != null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }
    public static int pairSum(ListNode head) {
        // ListNode slow = head;
        // ListNode fast = head;
        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // ListNode p2 = reverseLL(slow);
        // ListNode p1 = head;
        // int max = Integer.MIN_VALUE;
        // while (p2 != null && p1 != null) {
        //     int candidate = p1.val + p2.val;
        //     max = Math.max(max, candidate);
        //     p1 = p1.next;
        //     p2 = p2.next;
        // }
        // return max;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse the second half
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        // Find maximum twin sum
        int max = 0;
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            max = Math.max(max, first.val + second.val);
            first = first.next;
            second = second.next;
        }
        return max;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(pairSum(head));
    }
}
