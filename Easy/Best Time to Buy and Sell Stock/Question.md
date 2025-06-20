# 📈 Best Time to Buy and Sell Stock

This project solves the **"Best Time to Buy and Sell Stock"** problem, a classic interview and algorithm challenge. The goal is to determine the maximum profit you can achieve by buying and selling a stock on different days.

## 🧩 Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i-th` day.

You want to maximize your profit by choosing a **single day to buy** one stock and choosing a **different day in the future to sell** that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.

---

## 🧠 Example

### Example 1

```
Input:  prices = [7,1,5,3,6,4]  
Output: 5  
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6). Profit = 6 - 1 = 5.
```

### Example 2

```
Input:  prices = [7,6,4,3,1]  
Output: 0  
Explanation: No profit can be made since the stock price only decreases.
```

---

## 🔒 Constraints

- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`

---

## ✅ Approach

- **Track the minimum price** encountered so far.
- For each price, calculate the potential profit if sold today.
- Keep updating the maximum profit found so far.

This approach has:
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 📌 Notes

- You must buy before you sell.
- Only **one transaction** (buy + sell) is allowed.

---

## 📂 Related Topics

- Arrays  
- Dynamic Programming  
- Greedy Algorithms
