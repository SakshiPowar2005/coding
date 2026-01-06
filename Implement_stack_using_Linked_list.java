
class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}
    
class LinkedListStack {
    Node top;
    int size;
    public LinkedListStack() {
        
        top = null;
        size = 0;
    }

    public void push(int x) {
       
       Node temp = new Node(x);
       temp.next = top;
       top = temp;
       size += 1;
    }

    public int pop() {

        if(top == null)
        {
            return -1;
        }

        Node temp = top;
        top = top.next;
        size = size - 1;

        return temp.data;
    }

    public int top() {
        
        if(top == null)
        {
            return -1;
        }

        return top.data;
    }

    public boolean isEmpty() {

        return top == null;
    }
}
