import java.util.*;
interface A<T>
{
    public void push(Object i);
    public void pop();
    public Object peek();
    public boolean isEmpty();
    public int search(Object f);
}

class Stack<T> implements A<T>
{
    Integer capacity;
    Object arr[];
    Integer size;
    Stack(Integer cap)
    {
        capacity=cap;
        arr=new Object[cap];
        size=-1;
    }
    public void push(Object i)
    {
        try
        {
            if(size==capacity-1)
            {
                throw new ArrayIndexOutOfBoundsException("Stack is Overflow");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        size++;
        arr[size]=i;
        System.out.println(size);
        
    }
    public void pop()
    {
        try
        {
            if(size==-1)
            {
                throw new Exception("Stack is Underflow");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        size--;
        
    }
    public Object peek()
    {
        return arr[size];
    }
    public boolean isEmpty()
    {
        if(size==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int search(Object f)
    {
        int i;
        for(i=0;i<size;i++)
        {
            if(arr[i]==f)
            {
                System.out.println("the number founds at index = "+i );
                break;
            }
        }
        return i;
    }
}
class StackDriver
{
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the capacity of stack");
        // int n=sc.nextInt();
        Stack<Double> s=new Stack<Double>(5);
        s.push(13.33);
        s.push(134.98);
        // s.push(1);
        s.push(103.45);
        Object p=s.peek();
        System.out.println("No.at te top "+p);
        s.push(11.3);
        Object r=s.peek();
        System.out.println("No.at te top "+r);
        s.push(2.00);
        // s.pop();
        
    }
}
