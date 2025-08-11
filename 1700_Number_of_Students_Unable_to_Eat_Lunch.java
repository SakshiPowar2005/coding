class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int[] arr = new int[2];
        arr[1] = 0;
        // arr[0] = count of students liking 0 sandwiches
        // arr[1] = count of students liking 1 sandwiches

        int n = students.length;

        for(int stud : students)
        {
            arr[stud]++;
        }

        for(int i = 0; i < n; i++)
        {
            int sand = sandwiches[i];
            if(arr[sand] == 0)
            {
                return (n - i);
            }

            arr[sand]--;
        }

        return 0;
    }
}
