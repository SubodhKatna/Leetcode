# ➕ Two Sum

This repository contains a solution to the **"Two Sum"** problem — one of the most fundamental and frequently asked problems in coding interviews.

---

## 🧩 Problem Statement

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

You may:

- Assume that **each input** would have **exactly one solution**.
- **Not use the same element twice**.
- Return the answer in **any order**.

---

## 🧠 Examples

### Example 1

```
Input:  nums = [2,7,11,15], target = 9  
Output: [0,1]  
Explanation: nums[0] + nums[1] = 2 + 7 = 9
```

### Example 2

```
Input:  nums = [3,2,4], target = 6  
Output: [1,2]
```

### Example 3

```
Input:  nums = [3,3], target = 6  
Output: [0,1]
```

---

## 🔒 Constraints

- `2 <= nums.length <= 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`
- `-10⁹ <= target <= 10⁹`
- **Only one valid answer exists.**

---

## ✅ Approach

### Hash Map (Optimal - O(n) time)

1. Iterate through the array.
2. For each number, calculate its complement (`target - num`).
3. Check if the complement exists in a hash map.
4. If it does, return the current index and the index of the complement.
5. Otherwise, store the current number and its index in the map.

---

## 📌 Notes

- The brute force approach (nested loops) works but has `O(n²)` time complexity.
- The optimal approach using a hash map reduces time to **O(n)** and space to **O(n)**.
- Great practice for **hashing**, **arrays**, and **search problems**.

---

## 📂 Related Topics

- Hash Tables  
- Arrays  
- Two Pointers (in sorted variants)  
- Data Structures

---

## 🧠 Follow-up

**Can you come up with an algorithm that is less than `O(n²)` time complexity?**  
✅ Yes! The hash map approach solves this efficiently in linear time.
