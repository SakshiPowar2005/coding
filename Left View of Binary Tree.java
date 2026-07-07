/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        leftViewSide(root, ans, 0);
        return ans;
        
    }
    
    public void leftViewSide(Node root, ArrayList<Integer> ans, int depthLevel){
        if(root == null) return;
        
        if(depthLevel == ans.size()){
            ans.add(root.data);
        }
        
        leftViewSide(root.left, ans, depthLevel + 1);
        leftViewSide(root.right, ans, depthLevel + 1);
    }
}
