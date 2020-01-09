interface A<T>
{
    public void enqueue(int i);
    public void dequeue();
    public int Front();
    public int Rear();
    public int Size();
}
class Queue<T> implements A<T> 
{
    Integer arr[];
    Integer buffer;
    Integer front;
    Integer rear;
    Integer size;
    Queue(int cap)
    {
        buffer=cap;
        arr=new Integer[buffer];
        front=0;
        rear=0;
        size=0;
    }
    public void enqueue(int i)
    {
        try{
            if(rear==buffer)
            {
                throw new ArrayIndexOutOfBoundsException("Queue is overflow");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        size++;
        arr[rear]=i;
        rear++;
    }
    public void dequeue()
    {
        try{
            if(size==0)
            {
                throw new ArrayIndexOutOfBoundsException("Queue is Underflow");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        front++;
        size--;
    }
    public int Front()
    {
        return arr[front];
    }
    public int Rear()
    {
        return arr[--rear];
    }
    public int Size()
    {
        return size;
    }
}

class QueueDriver
{
    public static void main(String args[])
    {
        Queue<Integer> q=new Queue<Integer>(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(4);
        q.enqueue(50);
        q.dequeue();
        int s=q.Size();
        int r=q.Rear();
        int f=q.Front();
        System.out.println("front value = "+f+" Rear value = "+r);
        System.out.println("size = "+ s);
    }
}