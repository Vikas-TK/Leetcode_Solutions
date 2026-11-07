class Solution:
    def duplicateZeros(self, a: list[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        z=a.count(0)
        n=len(a)
        for i in range(n-1,-1,-1):
            if i+z<n:
                a[i+z]=a[i]
            if a[i]==0:
                z-=1
                if i+z<n:
                    a[i+z]=0
