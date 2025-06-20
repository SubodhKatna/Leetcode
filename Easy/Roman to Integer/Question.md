# 🔁 Roman to Integer

This repository provides a solution to the **"Roman to Integer"** problem — a common algorithmic question involving string parsing and numeral systems.

---

## 🧩 Problem Statement

Roman numerals are represented by seven different symbols:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example:

- `II` = 2  
- `XII` = 12  
- `XXVII` = 27  

Normally, Roman numerals are written from largest to smallest left to right. However, **subtractive notation** is used in the following six cases:

- `IV` = 4 → (I before V)
- `IX` = 9 → (I before X)
- `XL` = 40 → (X before L)
- `XC` = 90 → (X before C)
- `CD` = 400 → (C before D)
- `CM` = 900 → (C before M)

---

## 🧠 Examples

### Example 1

```
Input:  s = "III"  
Output: 3  
Explanation: III = 3
```

### Example 2

```
Input:  s = "LVIII"  
Output: 58  
Explanation: L = 50, V = 5, III = 3
```

### Example 3

```
Input:  s = "MCMXCIV"  
Output: 1994  
Explanation: M = 1000, CM = 900, XC = 90, IV = 4
```

---

## 🔒 Constraints

- `1 <= s.length <= 15`
- `s` contains only characters: `'I'`, `'V'`, `'X'`, `'L'`, `'C'`, `'D'`, `'M'`
- It is guaranteed that `s` is a **valid Roman numeral** in the range `[1, 3999]`

---

## ✅ Approach

- Use a hash map to store Roman numeral values.
- Traverse the string from left to right.
- If the current character represents a value **less than the next one**, subtract it.
- Otherwise, add it.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 📌 Notes

- Subtraction is only used in valid combinations (e.g., `IV`, not `IL` or `IC`).
- This problem is a great practice in both **string traversal** and **conditional logic**.

---

## 📂 Related Topics

- Strings  
- Hash Maps  
- Math  
