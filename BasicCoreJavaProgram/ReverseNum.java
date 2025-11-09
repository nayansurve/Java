import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[])
    {

        int n, rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        n=sc.nextInt();

        while (n > 0) {

            rem= n%10;
            rev=rev*10+rem;
            n=n/10;
            
        }
         System.out.println("Reverse Number ="+rev);
    }
}
