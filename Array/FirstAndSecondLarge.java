import java.util.Scanner;

public class FirstAndSecondLarge {
    public static void main(String args[]) {

        int arr[] = new int[5];
        int i, large, large1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Five Elements");

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        large = arr[0];
        large1 = arr[0];

        for (i = 1; i < 5; i++) {
            
                if (arr[i] > large) {
                    large1 = large;
                    large = arr[i];
                } else if (arr[i] > large1 && arr[i] < large) {
                    large1 = arr[i];
                }
            }
             System.out.println("Largest number: " + large);
        System.out.println("Second largest number: " + large1);

        }

    }

