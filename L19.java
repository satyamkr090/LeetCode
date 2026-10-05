public class L19 {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
                //approach1:
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;

        // int len = 0;
        // ListNode l = head;

        // while (l != null) {
        //     len = len + 1;
        //     l = l.next;
        // }

        // int d = len - n + 1;

        // ListNode prev = dummy,
        //          curr = head;

        // int i = 0;

        // while (i < (d - 1)) {
        //     curr = curr.next;
        //     prev = prev.next;
        //     i++;
        // }

        // prev.next = prev.next.next;

        // return dummy.next;

                //Approach2: 
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode l = head;
        int jumps = 0;
        while(jumps<n && l != null){
            l = l.next;
            jumps++;
        }
        
        ListNode prev = dummy,
                curr = l;
                
        while(curr != null){
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return dummy.next;
    
    }

    // Print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int n = 2;
        ListNode result = removeNthFromEnd(head, n);
        printList(result);
    }
}
