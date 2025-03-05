# Sum of Digits of String After Convert

## Problem Description

You are given a string `s` consisting of lowercase English letters, and an integer `k`.

First, convert `s` into an integer by replacing each letter with its position in the alphabet (i.e., replace `'a'` with `1`, `'b'` with `2`, ..., `'z'` with `26`). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation `k` times in total.

### Example 1

**Input**: 
```
s = "iiii", k = 1
```
**Output:**
```
36
```
Explanation: The operations are as follows:
- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.

### Example 2

**Input**: 
```
s = "leetcode", k = 2
```
**Output:**
```
6
```
Explanation: The operations are as follows:
- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
- Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.