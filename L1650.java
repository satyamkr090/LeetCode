public class L1650 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node lowestCommonAncestor(Node p, Node q) {
        Node p1 = p,
            q1 = q;
            while (p1 != q1) {
                p1 = (p1 == null) ? p : p1.parent;
                q1 = (q1 == null) ? q : q1.parent;
            }
        return p1;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node2 = new Node(2);
        Node node1 = new Node(1);

        root.left = node3;
        root.right = node4;
        node3.left = node2;
        node3.right = node1;
        node3.parent = root;
        node4.parent = root;
        node2.parent = node3;
        node1.parent = node3;

        Node p = node1;
        Node q = node2;

        Node result = lowestCommonAncestor(p, q);
        System.out.println("LCA = " + result.val);
    }
}