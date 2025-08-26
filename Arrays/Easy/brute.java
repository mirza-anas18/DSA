import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int[] arr = {5, 8, 8, 2, 7};
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Largest element is at the last index
        int largest = arr[n - 1];
        int secondLargest = -1; // assuming array has positive numbers

        // Move backwards to find distinct second largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("No distinct second largest element.");
        } else {
            System.out.println("Second Largest element: " + secondLargest);
        }
    }
}
