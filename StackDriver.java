import java.util.*;
interface A<T>
{
    public void push(int i);
    public void pop();
    public int peek();
    public boolean isEmpty();
    public int search(int f);
}

class Stack<T> implements A<T>
{
    Integer capacity;
    Integer arr[];
    Integer size;
    Stack(Integer cap)
    {
        capacity=cap;
        arr=new Integer[cap];
        size=-1;
    }
    public void push(int i)
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
    public int peek()
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
    public int search(int f)
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
        Stack<Integer> s=new Stack<Integer>(5);
        s.push(13);
        s.push(134);
        s.push(1);
        s.push(103);
        int p=s.peek();
        System.out.println("No.at te top "+p);
        s.push(11);
        int r=s.peek();
        System.out.println("No.at te top "+r);
        s.push(2);
        // s.pop();
        
    }
}
