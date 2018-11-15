import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        int[] check = randArr(10);
        printArr(check);
        bubbleSort(check);


        int[] check2 = Arrays.copyOf(check,check.length);
        printArr(check2);
    }

    public static int[] randArr(int count)
    {
        int[] randArr = new int[count];

        for(int i=0; i<randArr.length;i++)
        {
            randArr[i] = (int)(Math.random()*10001);
        }
        return(randArr);
    }

    public static void printArr(int[] arr)
    {
        String out = "";

        for(int i =0;i<arr.length;i++)
        {
            out += arr[i];
            if(i != arr.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);
    }

}
