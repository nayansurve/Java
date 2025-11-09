import java.util.Scanner;

public class PositiveNegative {
    
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        n=sc.nextInt();

        if(n >=0)
        {
            System.out.println("number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
