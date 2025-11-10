import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class NonRepartingChar {
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String =");
        str=sc.nextLine();
        int count,i,j;

        for(i=0;i<str.length();i++){
          count=0;

          for(j=0;j<str.length();j++)
          {
            if(str.charAt(i) == str.charAt(j))
            {
                count ++;
            }
          }
          
          if (count == 1) {
              System.out.println(str.charAt(i)+ " count"+count);
          }
        }
    
    }
}
