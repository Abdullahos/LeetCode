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
    public Node connect(Node root) {
        if(root == null)    return null;
        stk.push(root);
        while(stk.peek()!=null){
            ArrayList<Node> list = new ArrayList<Node>();
            while(!stk.empty()){
                list.add(stk.pop());
            }
            for(int i = list.size()-1; i >= 0 ; i--){
                Node node = (Node)list.get(i);
                stk.push(node.right);
                stk.push(node.left);
            }
            Node last = list.get(0);
            for(int i = 1; i < list.size(); i++){
                Node next = list.get(i);
                last.next = next;
                System.out.println(last.val+" "+next.val );
                last = next;
            }
        }
        return root;

    }
}