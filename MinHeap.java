import java.util.*;
class MinHeap
{
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void heapify(int arr[],int i)
    {
        int n=arr.length;
        int left=2*i;
        int right=2*i+1;
        int smallest=i;
        if(left<n && arr[left]<arr[smallest])
        {
            smallest=left;
        }
        
        if(right<n && arr[right]<arr[smallest])
        {
            smallest=right;
        }
        if(smallest!=i)
        {
            swap(arr,smallest,i);
            heapify(arr, smallest);
        }
    }
    public int[] build(int[] arr)
    {
        int n=arr.length;
        for(int i=n/2;i>=1;i--)
        {
            heapify(arr,i);
        }
        return arr;
    }
    public static void main(String args[])
    {
        MinHeap m=new MinHeap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter no.");
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a[]=m.build(arr);
        for(int i=1;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}