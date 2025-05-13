Container With Most Water
Problem Description
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the iᵗʰ line are at (i, 0) and (i, height[i]).
EnjoyAlgorithms
+3
Stack Overflow
+3
Mathematics Stack Exchange
+3

Find two lines that, together with the x-axis, form a container such that the container contains the most water.

Return the maximum amount of water a container can store.

Note: You may not slant the container.

Visual Representation
Here's a visual representation of the input array height = [1,8,6,2,5,4,8,3,7]:

markdown
Copy
Edit

|                             |                                      
|     |                       |                                      
|     |         |             |                                      
|     |         |     |       |                                      
|     | |       |     |       |                                      
|     | |   |   |     |   |   |                                      
|     | |   |   | |   |   |   |                                      
|     | |   |   | |   |   |   |                                      
|     | |   |   | |   |   |   |                                      
|_____|_|___|___|_|___|___|___|____                                  
  0   1   2   3   4   5   6   7   8
In this diagram, each vertical bar represents the height at that index in the array. The goal is to select two lines that, together with the x-axis, form a container that holds the most water.
neetcode.io

Example 1
Input: height = [1,8,6,2,5,4,8,3,7]

Output: 49

Explanation: The lines at indices 1 and 8 form a container with a height of 7 (the shorter of the two lines) and a width of 8 - 1 = 7. The area is 7 * 7 = 49.

Example 2
Input: height = [1,1]

Output: 1

Explanation: The lines at indices 0 and 1 both have a height of 1 and a width of 1. The area is 1 * 1 = 1.

Constraints
n == height.length

2 <= n <= 10⁵

0 <= height[i] <= 10⁴
GeeksforGeeks

