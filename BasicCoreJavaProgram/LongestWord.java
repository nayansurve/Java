import java.util.Scanner;

public class LongestWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        String Longest = "";
        String Current = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                Current = Current + ch; 
            } else { 
               
                if(Current.length() > Longest.length()) {
                    Longest = Current;
                }
                Current = ""; 
            }
        }

        
        if(Current.length() > Longest.length()) {
            Longest = Current;
        }

        System.out.println("Longest Word = " + Longest);
        System.out.println("Length = " + Longest.length());
    }
}
