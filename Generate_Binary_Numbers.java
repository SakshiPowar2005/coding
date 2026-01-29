class Solution {
    public ArrayList<String> generateBinary(int n) {
        
        ArrayList<String> list = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>();
        
        queue.offer("1");
        for(int i = 0; i < n; i++)
        {
            list.add(queue.poll());
            String n1 = list.get(i) + "0";
            String n2 = list.get(i) + "1";
            
            queue.offer(n1);
            queue.offer(n2);
        }
        
        return list;
    }
}
