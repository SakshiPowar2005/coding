// class Solution {
//     public int findTheWinner(int n, int k) {
        
//         Deque<Integer> dq = new ArrayDeque<>();
//         for(int i = 1; i <= n; i++)
//         {
//             dq.offer(i);
//         }

//         while(dq.size() > 1)
//         {
//             for(int j = 1; j < k; j++)
//             {
//                 dq.offer(dq.pollFirst());
//             }

//             dq.pollFirst();
//         }

//         return dq.peekFirst();
//     }
// }



//optimal solution
class Solution{
    public int findTheWinner(int n, int k){

        int ans = 0;
        for(int i = 2; i <= n; i++)
        {
            ans = (ans + k) % i;
        }

        return ans + 1; // 0-based indexing
    }
} 
