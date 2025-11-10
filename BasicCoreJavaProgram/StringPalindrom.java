
import java.util.Scanner;

public class StringPalindrom {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter A String =");
        str=sc.nextLine();
        String rev="";
        String str1=str;

        for(int i=str.length()-1;i>=0;i--)
        {
            rev += str.charAt(i);
        }
        System.out.println("Reverse String is =" + rev);
        
    
     if(str1.equals(rev))
        {
            System.out.println("String is palindrom");
        }
        else
        {
            System.out.println("String is not palindrom");
        }
}
}