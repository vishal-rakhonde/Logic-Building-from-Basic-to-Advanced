# Delete Characters to Make Fancy String

## Problem Description
A **fancy string** is defined as a string where no three consecutive characters are equal.

Given a string `s`, the task is to delete the minimum number of characters to make the string fancy. 

Return the final string after deletion. The answer will always be unique.

## Examples

### Example 1:
**Input:** `s = "leeetcode"`  
**Output:** `"leetcode"`  
**Explanation:**  
Remove one 'e' from the first group of 'e's to get `"leetcode"`. Now, no three consecutive characters are equal.

### Example 2:
**Input:** `s = "aaabaaaa"`  
**Output:** `"aabaa"`  
**Explanation:**  
- Remove one 'a' from the first group of 'a's to get `"aabaaaa"`.
- Remove two 'a's from the second group to get `"aabaa"`. Now, no three consecutive characters are equal.

### Example 3:
**Input:** `s = "aab"`  
**Output:** `"aab"`  
**Explanation:**  
No three consecutive characters are equal, so no deletions are needed.

## Constraints
- 1 <= s.length <= 10^5
- `s` consists only of lowercase English letters.
