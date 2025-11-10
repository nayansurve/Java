
 import java.util.Scanner;

// public class RemoveSpace {
//     public static void main(String args[])
//     {
//         String str;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a String =");
//         str=sc.nextLine();

//         str= str.replace(" ", "");
//         System.out.println("String after Removing Space =" +str);
//     }
// }

/// Replace All  spaces from string

public class RemoveSpace{
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String =");
        str=sc.nextLine();

        str=str.replaceAll("\\s+" , "");

        System.out.println("After Removing all space from string = ");
        System.out.println(str);
    }
}