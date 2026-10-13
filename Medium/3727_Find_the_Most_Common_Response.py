class Solution:
    def maxAlternatingSum(self, a: List[int]) -> int:
        n=len(a)
        arr=[]
        for x in a:
            arr.append(x*x)
        k=n//2
        arr.sort()
        
        ans=sum(arr[k:])-sum(arr[:k])
        return ans
