class ArrayQueue {
    int start;
    int end;
    int currsize;
    int size;
    int[] queue;

    public ArrayQueue() {
        start = -1;
        end = -1;
        currsize = 0;
        size = 100;
        queue = new int[100];
    }

    public void push(int x) {
       
       if(currsize == size)
       {
           System.out.println("Queue is full..");
           return;
       }
       if(currsize == 0)
       {
           start = 0;
           end = 0;
       }
       else
       {
           end = (end + 1) % size;
       }
       queue[end] = x;
       currsize += 1;
    }

    public int pop() {

        if(currsize == 0)
        {
            System.out.println("Queue is empty..you can't remove element");
            return -1;
        }
        int element = queue[start];
        if(currsize == 1)
        {
            start = end = -1;
        }
        else{
            start = (start + 1) % size;
        }

        currsize = currsize - 1;
        return element;
    }

    public int peek() {
        
        if(currsize == 0)
        {
            return -1;
        }
        return queue[start];
    }

    public boolean isEmpty() {

        return start == -1;
    }
}
