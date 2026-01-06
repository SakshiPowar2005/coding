class ArrayStack {
    int top;
    int[] st;

    public ArrayStack() {
        
        top = -1;
        st = new int[100];

    }

    public void push(int x) {
       
       if(top >= 99) 
       {
           System.out.println("Stack is exceeding..");
           return;
       }
       top = top + 1;
       st[top] = x;
    }

    public int pop() {
      if(top == -1) 
      {
          System.out.println("Stack is empty...");
          return -1;
      }
      int temp = st[top];
      top = top - 1;
      return temp;
    }

    public int top() {
        if(top == -1)
        {
            System.out.println("Top element is not present in stack..");
            return -1;
        }
        return st[top];
        
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
