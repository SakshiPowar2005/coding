/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Pair{
    Node node;
    int hd;
    
    Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.node.data);
            
            if(temp.node.left != null){
                q.add(new Pair(temp.node.left, hd - 1));
            }
            if(temp.node.right != null){
                q.add(new Pair(temp.node.right, hd + 1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
        
    }
}
