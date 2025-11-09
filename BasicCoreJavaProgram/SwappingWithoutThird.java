import java.util.Scanner;

public class SwappingWithoutThird {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("before Swapping the values =");
        System.out.println("a="+a+"b="+b);

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("afer swapping the values ");
        System.out.println("a="+ a +"b="+ b);
    }
}
