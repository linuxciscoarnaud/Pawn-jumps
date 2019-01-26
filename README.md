# Pawn-jumps
Java program that returns the number of jumps after which the pawn will be out of the array.

A non-empty array A consisting of N integers is given. Each element of the array can be treated as a relative pointer to element in the array:
if A[K] = M then element A[K] points to element A[K+M].

The array defines a sequence of jumps of a pawn as follows;
- initially, the pawn is located at element A[0];
- on each jump the pawn moves from its current element to the destination element pointed to by the current; i.e. if the pawn stands on element A[K] then it
jumps to the element pointed to by A[K];
- the pawn may jump forever or may jump out of the array.
