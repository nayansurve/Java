import java.util.Scanner;
import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort the array (optional, but makes it easier)
        Arrays.sort(arr);

        boolean[] visited = new boolean[n];  // To track counted elements

        System.out.println("Frequency of elements:");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;  // Mark duplicate as counted
                }
            }

            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }

        sc.close();
    }
}
