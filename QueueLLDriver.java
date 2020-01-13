

interface A<T>
{
    public void enqueue(T i);
    public void dequeue();
    public Object Front();
    public Object Rear();
    
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
class QueueLL<T> implements A<T>
{
    int size;
    Node<T> head,tail;
    QueueLL()
    {
        size=0;
        head=tail=null;
    }
    public void enqueue(T v)
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
    public void dequeue()
    {
        Node<T> ob=head;
        head=head.next;
        ob.next=null;
        size--;
    }
    public T Front()
    {
        return head.val;
    }
    public T Rear()
    {
        return tail.val;
    }
}
class QueueLLDriver
{
    public static void main(String args[])
    {
        QueueLL<Integer> s=new QueueLL<Integer>();
        s.enqueue(2);
        s.enqueue(4);
        s.enqueue(5);
        s.enqueue(1);
        s.enqueue(10);
        s.dequeue();
        s.dequeue();
        System.out.println(s.Front());
        System.out.println(s.Rear());
    }
}