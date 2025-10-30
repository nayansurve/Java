import java.util.Scanner;

public class LargeSmallestNum {

    public static void main(String args[])
    {
        int arr[]=new int[5];
        int i,small,large;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five Elements");
      for(i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();

      }
      large =arr[0];
      small = arr[0];

     for(i=1;i<5;i++)
      {
        if (arr[i]>large)
         {
            large=arr[i];
        }
        else if (arr[i]<small) {
            small=arr[i];
            
        }
        else
        {
            System.out.println("Largest Number is = "+large);
            System.out.println("Smallest Number is = "+small);
        }
      }

      
    }
      
    
}
