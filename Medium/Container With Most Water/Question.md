# 🧱 Container With Most Water

This repository contains a solution to the **"Container With Most Water"** problem — a classic algorithm question involving two-pointer techniques and array manipulation.

---

## 🧩 Problem Description

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `iᵗʰ` line are at `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container that holds the **maximum amount of water**.

Return the **maximum area** of water the container can store.

📌 **Note:** The container must be vertical (no slanting allowed).

---

## 🖼️ Visual Representation

Given `height = [1,8,6,2,5,4,8,3,7]`, the diagram below represents each vertical bar at index `i`:

![Container with most water](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

The optimal container is formed between the lines at index `1` and index `8`.

---

## 🧠 Examples

### Example 1

```
Input:  height = [1,8,6,2,5,4,8,3,7]  
Output: 49  
Explanation: 
Height = min(8, 7) = 7  
Width = 8 - 1 = 7  
Area = 7 * 7 = 49
```

### Example 2

```
Input:  height = [1,1]  
Output: 1  
Explanation: 
Height = min(1, 1) = 1  
Width = 1  
Area = 1 * 1 = 1
```

---

## 🔒 Constraints

- `n == height.length`
- `2 <= n <= 10⁵`
- `0 <= height[i] <= 10⁴`

---

## ✅ Approach

### Two-Pointer Technique

1. Initialize two pointers: one at the beginning (`left`) and one at the end (`right`) of the array.
2. Calculate the area between the lines pointed by `left` and `right`.
3. Move the pointer with the **shorter height** inward to try and find a larger container.
4. Repeat until the two pointers meet.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 📌 Notes

- The area of the container is determined by the shorter of the two lines.
- This is a great example of using **greedy and two-pointer techniques** to achieve optimal time complexity.

---

## 📂 Related Topics

- Two Pointers  
- Greedy Algorithms  
- Arrays  
- Geometry  
