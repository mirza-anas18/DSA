public class brute {
    // Function to left rotate array by d places (Brute Force)
    public static void brute(int[] arr, int n, int d) {
        d = d % n; // handle if d > n

        // Step 1: Store first d elements in temp
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift remaining elements to left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Step 3: Copy temp back to end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;

        brute(arr, n, d);

        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
