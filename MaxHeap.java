import java.util.*;
class MaxHeap
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
        int largest=i;
        if(left<n && arr[left]>arr[largest])
        {
            largest=left;
        }
        
        if(right<n && arr[right]>arr[largest])
        {
            largest=right;
        }
        if(largest!=i)
        {
            swap(arr,largest,i);
            heapify(arr, largest);
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
        MaxHeap m=new MaxHeap();
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