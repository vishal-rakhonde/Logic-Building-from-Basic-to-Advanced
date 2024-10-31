# Fibonacci series

## Problem Statement
Write a Java program to calculate the Fibonacci series up to a specified number of terms. The Fibonacci series is a sequence of numbers where each term is the sum of the two preceding terms, starting with 0 and 1. For example, the first few terms in the Fibonacci sequence are: 0, 1, 1, 2, 3, 5, 8, 13, ...

## Input
- An integer `n` representing the number of terms in the Fibonacci series to generate.

## Output
- A list of the first `n` terms in the Fibonacci sequence.

### Example
#### Input
```
n = 5
```

#### Output
```
0, 1, 1, 2, 3
```
## Explanation
The Fibonacci series starts with 0 and 1. Each subsequent term is the sum of the previous two terms.
- Term 1: 0
- Term 2: 1
- Term 3: 0 + 1 = 1
- Term 4: 1 + 1 = 2
- Term 5: 1 + 2 = 3

Hence, the first 5 terms are: 0, 1, 1, 2, 3.

## Constraints
- `n` should be a positive integer, `n >= 1`.
- For large values of `n`, consider optimizing the approach or using an iterative solution rather than recursion to avoid stack overflow errors.
