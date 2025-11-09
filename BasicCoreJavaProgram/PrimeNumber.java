import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number =");
        n=sc.nextInt();

        boolean isPrime=true;

        if(n<1)
        {
           isPrime=false;
        }
        else
        {
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }

    }
}
