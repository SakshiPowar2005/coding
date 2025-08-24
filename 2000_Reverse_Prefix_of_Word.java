class Solution {
    public String reversePrefix(String word, char ch) {
        
        char[] arr = word.toCharArray();
        int end = word.indexOf(ch);
        int i = 0;
         
        if(end == -1)  return word;

        while(i < end)
        {
            char temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

            i++;
            end--;
        }

        return new String(arr);
    }
}
