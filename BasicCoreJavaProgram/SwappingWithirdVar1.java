import java.util.Scanner;

public class SwappingWithirdVar1
{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Before Swapping the numbers :");
        System.out.println("a="+a + "b=" +b);

        c=b;
        b=a;
        a=c;

        
        System.out.println("After Swapping the numbrs =");
        System.out.println("a="+ a +" b=" +b);
    }
}