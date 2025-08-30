public class linearsearch {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;

        // Go through each element one by one
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;  // Return index if found
            }
        }

        return -1; // If not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 40};
        int target = 30;

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
