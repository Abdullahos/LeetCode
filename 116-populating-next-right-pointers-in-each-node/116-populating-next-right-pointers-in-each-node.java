/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    private Stack<Node>stk = new Stack<Node>(); 
        Queue<Node> q = new LinkedList<Node>();

    public Node connect(Node root) {
       if(root == null || root.left == null)    return root;
        q.add(root);
        int i = 1;
        while(q.peek()!=null){
            Node n = q.poll();
            if((Math.log(i+1)/Math.log(2))%1==0) connect(q,n);
            q.add(n.left);
            q.add(n.right);
            i += 2;
        } 
        return root;
    }
    public static void connect(Queue<Node> q, Node top){
        Node p = top;
        for(Node c : q){        
            p.next = c;
            p = c;
        }   
    }
}