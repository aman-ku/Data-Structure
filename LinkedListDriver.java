interface List<T>
{
    public void add(T a);
    public void delete(T b);
    public void traverse();
    // public void search(T c);
}
class Node<T>
{
    T val;
    Node next;
    Node(T v)
    {
        val=v;
        next=null;
    }
}
class LinkedList<T> implements List<T>
{
    int size;
    Node<T> head,tail;
    LinkedList()
    {
        size=0;
        head=tail=null;
    }
    public void add(T v)
    {
        Node ob=new Node(v);
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
    public void delete(T v)
    {
        Node d=head;
        Node f=head;
        while(f.next!=null)
        {
            if(d.val==v && head.val==v)
            {
                head=head.next;
                d.next=null;
                size--;
                break;
            }
            else if(d.val==v)
            {
                f.next=d.next;
                d.next=null;
                size--;
                break;
            }
            else if(d.val==v && d.next==null)
            {
                tail=f;
                tail.next=null;
                size--;
                break;
            }
            else
            {
                f=d;
                d=d.next;
            }
            

        }
        
    }
    public void traverse()
    {
        Node a=head;
        while(a.next!=null)
        {
            System.out.println(a.val);
            a=a.next;
        }
        System.out.println(a.val);

    }
}
class LinkedListDriver
{
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(4);
        l.add(2);
        l.add(3);
        l.add(8);
        l.delete(8);
        l.traverse();
    }

}