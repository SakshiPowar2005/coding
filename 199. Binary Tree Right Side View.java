/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        RightView(root,ans,0);
        return ans;
    }

    public void RightView(TreeNode node, List<Integer> ans, int depthLevel){
        if(node == null) return;
        if(depthLevel == ans.size()){
            ans.add(node.val);
        }

        RightView(node.right, ans, depthLevel + 1);
        RightView(node.left, ans, depthLevel + 1); 
    }
}
