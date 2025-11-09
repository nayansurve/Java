import java.util.Scanner;

public class Palindrom {
    
    public static void main(String args[])
    {
        int n, n1, rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number =");
        n=sc.nextInt();
        n1=n;
        while (n>0) {
            
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

          
        }
          if(rev == n1)
            {
                System.out.println("Number is palnidrom");
            }

            else
            {
                System.out.println("not palindrom");
            }
    }
}
