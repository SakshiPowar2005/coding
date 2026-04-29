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
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
        
//         List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
//         Queue<TreeNode> queue = new LinkedList<>();
//         if(root == null) return wraplist;
//         queue.offer(root);
//         while(!queue.isEmpty())
//         {
//             int levelnum = queue.size();
//             List<Integer> sublist = new ArrayList<>();
//             for(int i = 0; i < levelnum; i++)
//             {
//                 if(queue.peek().left != null)
//                 {
//                     queue.offer(queue.peek().left);
//                 }
//                 if(queue.peek().right != null)
//                 {
//                     queue.offer(queue.peek().right);
//                 }
//                 sublist.add(queue.poll().val);
//             }

//             wraplist.add(sublist);
//         }

//         return wraplist;
//     }
// }


// optimal approach

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> wraplist = new ArrayList<>();
        if (root == null) return wraplist;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelnum = queue.size();
            List<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < levelnum; i++) {
                TreeNode node = queue.poll();   

                sublist.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            wraplist.add(sublist);
        }

        return wraplist;
    }
}
