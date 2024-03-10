public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // If even, add it to the sum
                sum += i;
            }
        }

        // Print the summary
        System.out.println("Summary of even numbers from 1 to 100: " + sum);
    }
}
