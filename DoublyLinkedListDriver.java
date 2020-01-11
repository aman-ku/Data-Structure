interface List<T>
{
    public void add(T a);
    public void delete(T b);
    public void forwardtraverse();
    public void reversetraverse();
    public void add(T a,int p);
}
class Node<T>
{
    T val;
    Node<T> next;
    Node<T> pre;
    Node(T v)
    {
        val=v;
        next=null;
        pre=null;
    }
}
class DoublyLinkedList<T> implements List<T>
{
    int size;
    Node<T> head,tail,s;
    DoublyLinkedList()
    {
        size=0;
        head=tail=null;
    }
    public void add(T a,int p)
    {
        Node<T> key=new Node<T>(a);
        int i=0;
        Node<T> ob=head;
        Node<T> ob1;      
        while(i<p-1)
        {
            ob=ob.next;
            // ob1=ob1.next;
            i++;
        }
        ob1=ob.next;
        ob.next=key;
        ob=ob.next;
        ob.next=ob1;
        ob1.pre=ob;
    }
    public void add(T v)
    {
        Node<T> ob=new Node<T>(v);
        if(head==null)
        {
            head=tail=s=ob;
            size++;
        }
        else
        {
            tail.next=ob;
            tail=ob;
            tail.pre=s;
            s=ob;
            size++;
        }
    }
    public void forwardtraverse()
    {
        Node<T> a=head;
        while(a.next!=null)
        {
            System.out.println(a.val);
            a=a.next;
        }
        System.out.println(a.val);

    }
    public void reversetraverse()
    {
        Node<T> a=tail;
        while(a.pre!=null)
        {
            System.out.println(a.val);
            a=a.pre;
        }
        System.out.println(a.val);

    }
    public void delete(T v)
    {
        Node<T> d=head;
        while(d.next!=null)
        {
            if(d.val==v && head.val==v)
            {
                head=head.next;
                head.pre=null;
                d.next=null;
                d.pre=null;
                size--;
                break;
            }
            else if(d.val==v)
            {
                Node<T> f=d.pre;
                Node<T> k=d.next;
                f.next=k;
                k.pre=f;
                d.next=null;
                size--;
                break;
            }
            
            else
            {
                d=d.next;
            }
            

        }
        if(d.val==v && d.next==null)
            {   
                tail=tail.pre;
                tail.next=null;
                size--;
                
            }
    }
}
class DoublyLinkedListDriver
{
    public static void main(String args[])
    {
        DoublyLinkedList<Integer> l=new DoublyLinkedList<Integer>();
        l.add(4);
        l.add(2);
        l.add(3);
        l.add(8);
        l.add(10,2);
        // l.delete(8);
        l.forwardtraverse();
        // l.reversetraverse();
        
        // int k=l.search(3);
        // System.out.println(k);
    }

}