# 🔢 Palindrome Number

This repository contains a solution to the **"Palindrome Number"** problem — a common algorithm question that checks whether an integer reads the same forward and backward.

---

## 🧩 Problem Statement

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

A **palindrome** number is a number that reads the same backward as forward.

---

## 🧠 Examples

### Example 1

```
Input:  x = 121  
Output: true  
Explanation: 121 reads as 121 from left to right and from right to left.
```

### Example 2

```
Input:  x = -121  
Output: false  
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

### Example 3

```
Input:  x = 10  
Output: false  
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

---

## 🔒 Constraints

- `-2^31 <= x <= 2^31 - 1`

---

## ✅ Approach

- Negative numbers cannot be palindromes because of the minus sign (`-`).
- Convert the number to a string or reverse its digits mathematically and compare with the original.
- Do not use extra space if you want to follow the optimal in-place approach.

**Time Complexity:** `O(log₁₀(n))`  
**Space Complexity:** `O(1)` if no string conversion is used.

---

## 📌 Notes

- Avoid converting the number to a string if the goal is to solve it mathematically.
- Reversing only half the number is an optimized method to prevent integer overflow.

---

## 📂 Related Topics

- Math  
- Two Pointers  
- String (if using string conversion)  
