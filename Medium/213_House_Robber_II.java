class Solution:
    def rob(self, a: List[int]) -> int:
        n=len(a)
        
        dp=[0] * (n-1)
        dp1=[0] * (n-1)
        if n==1:
            return a[0]
        elif n==2:
            return max(a[0],a[1])
        else:
            one=0
            two=0
            dp[0]=a[0]
            dp[1]=max(dp[0],a[1])
            
            for i in range(2,len(a)-1):
                dp[i]=max(dp[i-1],a[i]+dp[i-2])
            one=dp[n-2]
            m=2
            dp1[0]=a[1]
            dp1[1]=max(dp1[0],a[2])
            for i in range(3,len(a)):
                dp1[m]=max(dp1[m-1],a[i]+dp1[m-2])
                m+=1
            two=dp1[n-2]
            return max(one,two)
