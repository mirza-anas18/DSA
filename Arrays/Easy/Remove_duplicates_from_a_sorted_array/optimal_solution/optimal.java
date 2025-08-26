import java.util.*;

class optimal {
    public int optimal(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int i = 0; // pointer for unique elements

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {   // found a new unique
                arr[i + 1] = arr[j]; // put it in next position
                i++;
            }
        }
        return i + 1; // count of unique elements
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int length = sol.optimal(arr);
        System.out.println("Length of unique elements = " + length);
    }
}
