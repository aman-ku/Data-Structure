interface A<T>
{
    public void push(T i);
    public void pop();
    public Object peek();
    public boolean isEmpty();
}
class Node<T>
{
    T val;
    Node<T> next;
    Node(T v)
    {
        val=v;
        next=null;
    }
}
class StackLL<T> implements A<T>
{
    int size;
    Node<T> head,tail;
    StackLL()
    {
        size=0;
        head=tail=null;
    }
    public void push(T v)
    {
        Node<T> ob=new Node<T>(v);
        if(head==null)
        {
            head=tail=ob;
            size++;
        }
        else
        {
            tail.next=ob;
            tail=ob;
            size++;
        }
    }
    public void pop()
    {
        Node<T> ob=head;
        while(ob.next!=tail)
        {
                ob=ob.next;
        }
        tail=ob;
        tail.next=null;
    }
    public T peek()
    {
        return tail.val;
    }
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class StackLLDriver
{
    public static void main(String args[])
    {
        StackLL<Integer> s=new StackLL<Integer>();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(7);
        s.push(8);
        s.pop();
        Object a=s.peek();
        System.out.println(a);
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s.peek());
    } 
}