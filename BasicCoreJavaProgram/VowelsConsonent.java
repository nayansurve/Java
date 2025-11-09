import java.util.Scanner;

public class VowelsConsonent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a String");
        str = sc.nextLine();
        int vowels=0,consonent=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=Character.toLowerCase(str.charAt(i));

            if(ch >= 'a' && ch <= 'z')
              {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels ++;
                }
                else
                consonent ++;
              }
        }

        System.out.println("Vowels" + vowels);
        System.out.println("Consonent" + consonent);
    }
}



