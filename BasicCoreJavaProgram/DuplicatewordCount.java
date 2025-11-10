import java.util.Scanner;

public class DuplicatewordCount {
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a String =");
        str=sc.nextLine();
        int count=1;

        for(i=0;i<str.length();i++){
        
            count=1;
            if(str.charAt(i) == '0') 
                continue;   
                
        
        for(j=i+1;j<str.length();j++){
        
            if(str.charAt(i)==str.charAt(j)) 
            {
                count ++;
                
                     str = str.substring(0, j) + '0' + str.substring(j + 1);
                

            }
        }
            if (count>=1) {
                System.out.println( str.charAt(i) + " count =" +count);
                
            }
        }
              
    }
}
    
