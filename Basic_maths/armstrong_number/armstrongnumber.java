import java.util.*;

public class armstrongnumber {

    public static void main(String[] args) {
        int number = 153;  // Example number
        int sum = 0;
        int temp = number; // Store original number

        while (number > 0) {
            int digit = number % 10;
            sum += (digit * digit * digit); // Multiply digit 3 times
            number /= 10;
        }

        // Compare sum with the original number
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
