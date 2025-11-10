import java.util.Scanner;

public class SortingArray {
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Array =");

        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Bubble Sort
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted Elements are = ");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
