class Solution:
    def rob(self, l: List[int]) -> int:
        n=len(l)
        dp=[0] * len(l)
        if n==1:
            return l[0]
        else:
            dp[0]=l[0]
            dp[1]=max(l[0],l[1])
            for i in range(2,len(l)):
                dp[i]=max(dp[i-1],l[i]+dp[i-2])
            return dp[n-1]
