import java.util.Scanner;

public class LargeSmallestNum {
    public static void main(String[] args) {
        
        int arr[]= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Array =");
        int small,large;
        int i,j;

        for( i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        
        }
        small= arr[0];
        large =arr[0];
      
         for(j=0;j<5;j++)
         {
            if (arr[j] < small)
            {
                small = arr[j];
            }
            if(arr[j] > large)
            {
                large = arr[j];
            }
         }
         System.out.println("Largest Element is =" + large);
         System.out.println("smallest elemnt is =" + small);
            
        }
    }

    


