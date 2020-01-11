interface LinearList<T>
{
    public void add(Object a);
    public void delete(int i);
    public void set(int f,Object n);
    public void get(int l);
    public void traverse();
    public void size(); 
}
class ArrayList<T> implements LinearList<T>
{
    Integer buffer;
    Integer size;  
    Object[] arr;
    ArrayList()
    {
        buffer=5;
        size=0;
        arr=new Object[buffer];
    }
    public void set(int f,Object n)
    {
        arr[f]=n;
    }
    public void delete(int j)
    {
        for(int i=j+1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        size--;
    }
    public void add(Object a)
    {
       if(size==buffer)
       {
           buffer*=2;
           Object[] arr1=new Object[buffer];
           for(int i=0;i<size;i++)
           {
                arr1[i]=arr[i];
           }
           arr1[size]=a;
           arr=arr1;
           size++;
       }
       else 
       {
        arr[size]=a;
        size++;
       }
       
    }
    public void traverse()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void size()
    {
        System.out.println(size);
    }
    public void get(int l)
    {
        System.out.println(arr[l]);
    }
}
class ArrayListDriver
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        a.traverse();
        a.size();
        a.delete(4); 
        a.get(4);
        a.size();
        a.set(0,22);
        a.traverse();
        a.size();
    }
}
