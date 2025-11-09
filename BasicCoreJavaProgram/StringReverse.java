import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s;
        System.out.println("Enter a Stirng =");
         s=sc.nextLine();
        String rev=" ";
        for(int i=s.length()-1; i>=0; i--)
        {
           rev +=s.charAt(i);
        }
          System.out.println("revesed String =" + rev);
    }
}
