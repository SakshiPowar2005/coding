class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {

        int res = 0;
        int s = q.size();
        
        for(int i = 0; i < s; i++)
        {
            int x = q.poll();
            if(x == k)
            {
                res++;
            }
            
            q.add(x);
        }
        
        return res;
    }
}
