class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // int n = arr.length;
        // for(int i = 0; i < n; i++)
        // {
        //     for(int j = i + 1; j < n; j++)
        //     {
        //         if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])
        //         {
        //             return true;
        //         }
        //     }
        // }

        // return false;

      

        //optimal approach
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            if(set.contains(2 * num))
            {
                return true;
            }
            if(num % 2 == 0 && set.contains(num / 2))
            {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
