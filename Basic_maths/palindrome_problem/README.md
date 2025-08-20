# Palindrome Checker in Java

This is a simple Java program that checks whether a given integer is a palindrome or not.  
A **palindrome** is a number that reads the same forwards and backwards, e.g., 121, 4554.

---

## 📌 How it works
1. The program takes an integer (`number`) as input.  
2. It creates a **duplicate** of the number for comparison.  
3. Using a `while` loop, it reverses the digits of the number:
   - Extract the last digit using `% 10`.  
   - Append it to a variable `revNum` that stores the reversed number.  
   - Remove the last digit from the original number using `/ 10`.  
4. After reversing, it checks if the original number and the reversed number are equal.  
5. If equal → the number is a palindrome, else it is not.

---
