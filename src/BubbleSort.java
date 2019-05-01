public class BubbleSort {
    private int[] arr;
    private int size;
    public BubbleSort(int max)
    {
        arr=new int[max];
        size=0;
    }
    public void insert(int value)
    {
        arr[size]=value;
        size++;
    }
    public void Display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
            System.out.println();

        }
    }
public void bubbleSort()
{
    int i,j;
    for(j=size-1;j>1;j--)
    {
        for(i=0;i<j;i++)
        {
            if(arr[i]>arr[i+1])
            {
                swap(i,i+1);

            }
        }
    }
}
public void swap(int x,int y)
{
    int temp=arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
}
}
class Bubblemain
{
    public static void main(String[] args) {

            int maxsize=100;
            BubbleSort obj=new BubbleSort(maxsize);
            obj.insert(77);
            obj.insert(99);
            obj.insert(44);
            obj.insert(55);
            obj.insert(22);
            obj.insert(88);
            obj.insert(11);
            obj.insert(00);
            obj.insert(66);
            obj.insert(33);
            obj.Display();
            obj.bubbleSort();
            obj.Display();

    }
}
