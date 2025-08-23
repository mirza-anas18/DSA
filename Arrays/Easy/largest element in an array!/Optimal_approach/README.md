# 📝 Largest Element in an Array — Optimal Solution  

## 📌 Problem Statement  
Given an array of integers, find the **largest element** in the array.  

---

## 🚀 Approach (Optimal Solution)  
Instead of sorting the array (which takes extra time), we can simply **scan the array once** and keep track of the maximum element.  

### Steps:
1. Assume the **first element** as the maximum (`max = arr[0]`).
2. Traverse through the array.
3. If any element is greater than the current `max`, update `max`.
4. At the end of the loop, `max` will store the largest element.  

---
📊 Complexity Analysis

Time Complexity:

We traverse the array once → O(n)

Space Complexity:

We only use one variable (max) → O(1)
