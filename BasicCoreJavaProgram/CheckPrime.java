public class CheckPrime {

    public static void main(String[] args) {
        int n = 100;

        // Loop through all numbers from 2 to 100
        for (int num = 2; num <= n; num++) {
            int count = 0;

            // Check if 'num' is prime
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) { // prime numbers have exactly 2 factors
                System.out.println(num);
            }
        }
    }
}
