import java.util.Scanner;

public class Spy {

    public static void main(String args[])
    {
        int n,rem=0,mul=1,sum=1,n1; //mul=1 beacuse  0 *1=0
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        n1=n;
        while (n>0) {

            rem=n%10;
            sum=sum+rem;
            mul=sum*rem;
            n=n/10;


            
        }

        if (mul == sum) {
            System.out.println( n1 + "  Number is Spy");
            
        }
        else
        {
            System.out.println(n1 + "  Number is not spy");
        }
    }
    
}
