class Solution:
    def countSuffix(self, a: list[int], t: list[int]) -> int:
        n=len(a)
        if sorted(a)!=sorted(t):
            return 0
        arr=[False]*n
        arr[n-1]=True
        for i in range(n-2,-1,-1):
            arr[i]=arr[i+1] and t[i]>=t[i+1]
        count=0
        pre=True
        for i in range(n):
            if pre and arr[i]:
                count+=1
            if a[i]!=t[i]:
                pre=False
        return count
            
