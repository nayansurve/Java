import java.util.Scanner;

public class P2
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a  number =");
      int n=sc.nextInt();
      int count=0;

      for(int i=1;i<=n;i++)
      {
        if(n%i==0)
        
        {
           count ++;
        }
        
      }
      System.out.println(count==2 ?"Prime Number":"Not Prime Number");


    }
}