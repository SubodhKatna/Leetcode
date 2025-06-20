# 🔠 Longest Common Prefix

This repository contains a solution to the **"Longest Common Prefix"** problem — a popular string problem frequently asked in coding interviews.

---

## 🧩 Problem Statement

Write a function to find the **longest common prefix** string among an array of strings.

If there is **no common prefix**, return an empty string `""`.

---

## 🧠 Examples

### Example 1

```
Input:  strs = ["flower", "flow", "flight"]  
Output: "fl"
```

### Example 2

```
Input:  strs = ["dog", "racecar", "car"]  
Output: ""
Explanation: There is no common prefix among the input strings.
```

---

## 🔒 Constraints

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters (if not empty)

---

## ✅ Approach

### Horizontal Scanning (Efficient and Simple)

1. Assume the first string is the prefix.
2. Compare the assumed prefix with the next string.
3. Reduce the prefix until it matches the beginning of the current string.
4. Repeat until all strings are processed or the prefix becomes empty.

**Time Complexity:** `O(N * M)`  
Where `N` is the number of strings and `M` is the length of the shortest string.

---

## 📌 Notes

- The longest common prefix must be a **prefix**, not necessarily a complete match.
- If the prefix becomes empty at any point, no common prefix exists.

---

## 📂 Related Topics

- Strings  
- Arrays  
- Trie (for advanced optimization)
