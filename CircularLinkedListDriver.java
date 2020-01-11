interface List<T>
{
    public void add(T a);
    public void traverse();
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
class CircularLinkedList<T> implements List<T>
{
    int size;
    Node<T> head,tail;
    CircularLinkedList()
    {
        size=0;
        head=tail=null;
    }
    
    public void add(T v)
    {
        Node<T> ob=new Node<T>(v);
        if(head==null)
        {
            head=tail=ob;
            tail.next=head;
            size++;
        }
        else
        {
            tail.next=ob;
            tail=ob;
            tail.next=head;
            size++;
        }
    }
    public void traverse()
    {
        Node<T> a=head.next;
        System.out.println(head.val);
        while(a.next!=head)
        {
            System.out.println(a.val);
            a=a.next;
        }
        System.out.println(a.val);

    }
}
class CircularLinkedListDriver
{
    public static void main(String args[])
    {
        CircularLinkedList<Integer> l=new CircularLinkedList<Integer>();
        l.add(4);
        l.add(2);
        l.add(3);
        l.add(8);
        l.traverse();
    }

}