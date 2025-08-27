import java.util.*;

class optimal {
    
    // Function to reverse part of array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to left rotate array by d
    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // handle if d > n

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining n-d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        leftRotate(arr, d);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
