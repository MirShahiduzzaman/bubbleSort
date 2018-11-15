public class bubbleSortLab
{
    public void bubbleSort(int[] arr)
    {
        int swapNum = 1;
        while(swapNum != 0)
        {
            swapNum = 0;
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    swap(arr,i,i+1);
                    swapNum++;
                }
            }
        }
    }

    public static void swap(int[] arr,int pos1,int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
