class Solution:
    def sumOfSquares(self, a: List[int]) -> int:
        n=len(a)
        c=0
        for i in range(1,n+1):
            if n%i==0:
                c+=a[i-1]*a[i-1]
        return c
