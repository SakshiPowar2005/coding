class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        // Queue<Integer> queue = new ArrayDeque<>();
        // for(int i = 0; i < tickets.length; i++)
        // {
        //     queue.offer(i);
        // }

        // int time = 0;
        // while(!queue.isEmpty())
        // {
        //     int person = queue.poll();

        //     tickets[person]--;
        //     time++;

        //     if(person == k && tickets[person] == 0)
        //     {
        //         return time;
        //     }

        //     if(tickets[person] > 0)
        //     {
        //         queue.offer(person);
        //     }
        // }

        // return time;



        //optimal approach
        int time = 0;
        for(int i = 0; i < tickets.length; i++)
        {
            if(i <= k)
            {
                time += Math.min(tickets[i], tickets[k]);
            }
            else
            {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }
}
