import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{

    public static boolean isAnagram( String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;

        }
        char[]a=str1.toCharArray();
        char[]b=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

         return Arrays.equals(a, b);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter a String");
        str1=sc.nextLine();
        System.out.println("Enter second string");
        str2=sc.nextLine();

        if (isAnagram(str1,str2)) {
            System.out.println("Angram");
        }
            else
            {
                System.out.println("Not angram");
            }
            
        
    }
}
