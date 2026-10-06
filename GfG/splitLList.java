package GfG;

public class splitLList {
    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    static class Pair<A, B> {
        A first;
        B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
    public static Pair<Node, Node> splitList(Node head) {
        Node slow = head,
            fast = head.next;
        
        while (fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next;

            if(fast.next != head){
                fast = fast.next;
            }
        }
        fast.next = slow.next;
        slow.next = head;

        return new Pair<Node, Node> (head, fast.next);
    }
    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = head;

        Pair<Node, Node> result = splitList(head);

        System.out.println(result.first.data + "-> " + result.first.next.data);
        System.out.println(result.second.data + "-> " + result.second.next.data);
}
}
