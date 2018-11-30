# JavaDynamicProgramming

We want to solve a problem by identifying a collection of subproblems, then solve these subproblems - smallest first.
For solving a subproblem we may use the solution to even smaller subproblems.
The subproblems should have the following property:
    There is an ordering on the subproblems and a relation which describes how we can solve a subproblem, if we are
    given the answers to subproblems that appear earlier in the ordering.

## Longest increasing subsequence (LIS)
Let x[0], x[1], ..., x[n-1] be a sequence of numbers.
What is the length L of the longest strictly increasing subsequence?
```
Pseudocode:
Denote L(i) = length of longest increasing subsequence of x[0], ..., x[i] ending in x[i].
Denote L(0) = 1, L(i) = 1 + [max(L(j)) for j such that x[j] < x[i]].
Then L = max(L(i)) such that i<n.
```