for “Check if Array is Sorted”, practically only the optimal O(n) solution matters.


---

## 🚀 Optimal Approach (Single Scan)
- Traverse the array once.  
- Compare each element with the next.  
- If you find any pair where `arr[i] > arr[i+1]`, the array is not sorted.  
- Otherwise, it is sorted.

**Complexity:**  
- Time: `O(n)`  
- Space: `O(1)`

---
