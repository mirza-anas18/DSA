# 🟢 Largest Element in Array — Brute Force Approach

This is the **brute-force solution** for finding the largest element in an array.  
It uses the built-in Java method `Arrays.sort()` to sort the entire array and then picks the last element as the maximum.

---


---

## 🛠️ Approach (Brute Force)
1. Sort the array in ascending order using `Arrays.sort(arr)`.
2. The last element of the sorted array (`arr[arr.length - 1]`) will always be the largest.
3. Return that value.

---

## ⏱️ Complexity Analysis
- **Time Complexity:** O(n log n)  
  (because sorting an array of length `n` takes `O(n log n)` using Dual-Pivot Quicksort in Java).  
- **Space Complexity:** O(1)  
  (since sorting happens in-place for primitive arrays in Java).

---
