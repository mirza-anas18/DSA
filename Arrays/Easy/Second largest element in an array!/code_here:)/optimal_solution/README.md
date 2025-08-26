
## 🚀 Optimal Approach 
- Maintain two variables: `largest` and `secondLargest`.  
- Traverse the array once:  
  - If the current element is greater than `largest`, update both.  
  - Else if the element is smaller than `largest` but greater than `secondLargest`, update only `secondLargest`.  
- At the end, `secondLargest` will hold the answer if it exists.

**Complexity:**  
- Time: `O(n)`  
- Space: `O(1)`

 ---
