# 🔄 Rotate Image

This repository contains a solution to the **"Rotate Image"** problem — a popular matrix transformation challenge where the goal is to rotate a square matrix 90 degrees clockwise **in-place**.

---

## 🧩 Problem Statement

You are given an `n x n` 2D matrix representing an image. Rotate the image **90 degrees clockwise**.

You must rotate the image **in-place**, meaning you cannot allocate another 2D matrix to perform the transformation.

---

## 🧠 Examples

### Example 1

![Example 1](https://assets.leetcode.com/uploads/2020/08/28/mat1.jpg)

```
Input:  matrix = [[1,2,3],[4,5,6],[7,8,9]]  
Output: [[7,4,1],[8,5,2],[9,6,3]]
```

### Example 2

![Example 2](https://assets.leetcode.com/uploads/2020/08/28/mat2.jpg)

```
Input:  matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]  
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
```

---

## 🔒 Constraints

- `n == matrix.length == matrix[i].length` (square matrix)
- `1 <= n <= 20`
- `-1000 <= matrix[i][j] <= 1000`

---

## ✅ Approach

To rotate the matrix in-place by 90 degrees clockwise:

1. **Transpose the matrix** — convert rows to columns.
2. **Reverse each row** — to complete the 90° clockwise rotation.

### Step-by-step Transformation (3x3 Example)

#### Original:
```
1 2 3  
4 5 6  
7 8 9
```

#### After Transpose:
```
1 4 7  
2 5 8  
3 6 9
```

#### After Row Reversal:
```
7 4 1  
8 5 2  
9 6 3
```

---

## 📌 Notes

- This problem requires **in-place** manipulation — do not use an additional matrix.
- Great practice for **matrix traversal**, **in-place algorithms**, and **2D array manipulation**.

---

## 📂 Related Topics

- Arrays  
- Matrix  
- In-place Algorithms  
- Simulation
