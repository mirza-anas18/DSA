# Armstrong Number Checker in Java

This Java program checks whether a given **integer** is an **Armstrong number**.  
An **Armstrong number** is a number that is equal to the sum of the cubes of its digits.  

---

## 📌 How it Works
1. Store the original number in a temporary variable.  
2. Extract each digit of the number using `% 10`.  
3. Multiply the digit three times (cube) and add it to a sum variable.  
4. Remove the last digit from the number using `/ 10`.  
5. After processing all digits, compare the sum with the original number:  
   - If equal → the number is an Armstrong number.  
   - If not equal → the number is not an Armstrong number.  

---
