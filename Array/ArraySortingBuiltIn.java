import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingBuiltIn {

    public static void main(String args[])
    {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an array =");
      
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            
        }
          Arrays.sort(arr);

        System.out.println("sorted elements are =");

        for ( int i=0;i<arr.length;i++)

        {
            System.out.println(arr[i]);
        }
        
      
    }
    
}
