class Solution:
    def minMoves2(self, a: list[int]) -> int:
        a.sort()
        c=a[len(a)//2]
        return sum(abs(c-x) for x in a)
