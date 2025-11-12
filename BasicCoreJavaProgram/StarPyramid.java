import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // Print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
