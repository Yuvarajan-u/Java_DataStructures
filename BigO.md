https://www.bigocheatsheet.com/

In Big-O notation, we focus on the dominant term because it represents the most significant factor affecting the growth rate of the algorithm as the input size (n) increases.

Why is O(n^2 + n) simplified to O(n^2)?
Dominant Term:

In n^2 + n, as n grows larger, the n^2 term grows much faster than the n term. For example:
If n = 10, n^2 = 100 and n = 10.
If n = 100, n^2 = 10,000 and n = 100.
Clearly, n^2 dominates the growth rate.
Big-O Ignores Constants and Lower-Order Terms:

Big-O notation is used to describe the asymptotic behavior of an algorithm, meaning how it behaves for very large input sizes.
Lower-order terms like n become insignificant compared to n^2 as n increases.
Constants are also ignored because they don't affect the growth rate.
Nested Loop Example:
If you have a nested loop (e.g., a loop inside another loop), the time complexity is typically O(n^2) because the inner loop runs n times for each iteration of the outer loop. If there is an additional single loop outside the nested loop, its complexity is O(n). When combined, the overall complexity becomes O(n^2 + n), but the O(n) term is dropped because O(n^2) dominates.

Simplification Rule:
Big-O notation simplifies expressions by:

Keeping the term with the highest growth rate.
Dropping constants and lower-order terms.
Thus, O(n^2 + n) simplifies to O(n^2).

Big-O notation is about growth rate dominance, not the exact sequence or summation of execution times. For large input sizes, the dominant term (n^2) overshadows the lower-order term (n), so we drop the latter.