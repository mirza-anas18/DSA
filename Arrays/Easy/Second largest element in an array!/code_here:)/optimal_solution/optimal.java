import java.util.*;

public class optimal {
    public static void main(String[] args) {
        int[] arr = {5, 8, 8, 2, 7};
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                // Update both largest and second largest
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                // Update second largest only
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element.");
        } else {
            System.out.println("Second Largest element: " + secondLargest);
        }
    }
}
