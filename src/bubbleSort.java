public class bubbleSort
{
    public void bubbleSort(int[] arr)
    {
        boolean done = false;
        while(!done)
        {
            done = true;
            for(int i=0;i<arr.length-1;i++)
            {
                int a = arr[i];
                int b = arr[i+1];
                if(a>b)
                {
                    done = false;
                    arr[i] = a;
                    arr[i+1] = a;
                }
            }
        }
    }
}
