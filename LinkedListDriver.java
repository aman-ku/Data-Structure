interface List<T>
{
    public void add(T a);
    public void delete(T b);
    public void traverse();
    public int search(T c);
    public void add(T a,int p);
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
    public void delete(T v)
    {
        Node<T> d=head;
        Node<T> f=head;
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
        Node<T> a=head;
        while(a.next!=null)
        {
            System.out.println(a.val);
            a=a.next;
        }
        System.out.println(a.val);

    }
    public int search(T c)
    {
        Node<T> ob=head;
        int i=0;
        while(ob.next!=null)
        {
            if(ob.val!=c)
            {
                i++;
                ob=ob.next;
            }
            else{
                break;
            }
        }
        return i;
    }
    public void add(T a,int p)
    {
        Node<T> key=new Node<T>(a);
        int i=0;
        Node<T> ob=head;
        Node<T> ob1=head.next;
        while(i<p-1)
        {
            ob=ob.next;
            ob1=ob1.next;
            i++;
        }
        ob.next=key;
        ob=ob.next;
        ob.next=ob1;
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
        l.add(10,2);
        // l.delete(8);
        l.traverse();
        int k=l.search(3);
        System.out.println(k);
    }

}
