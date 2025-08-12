// class Solution {
//     public List<List<Integer>> generate(int numRows) {
        
//         List<List<Integer>> ans = new ArrayList<List<Integer>>();
//         List<Integer> row , pre = null;

//         for(int i = 0; i < numRows; i++)
//         {
//             row = new ArrayList<Integer>();

//             for(int j = 0; j <= i; j++)
//             {
//                 if(j == 0 || j == i)
//                 {
//                     row.add(1);
//                 }
//                 else
//                 {
//                     row.add(pre.get(j - 1) + pre.get(j));
//                 }

//             }
//             pre = row;

//             ans.add(row);
//         }

//         return ans;
//     }
// }

class Solution
{
public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> pre = null;

    for (int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>(i + 1);
        for (int j = 0; j <= i; j++) {
            if (j == 0 || j == i) row.add(1);
            else row.add(pre.get(j - 1) + pre.get(j));
        }
        ans.add(row);
        pre = row;
    }
    return ans;
}
}
