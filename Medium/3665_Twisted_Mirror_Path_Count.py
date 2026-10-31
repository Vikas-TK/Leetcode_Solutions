class Solution:
    def uniquePaths(self, grid: List[List[int]]) -> int:
        r=len(grid)
        c=len(grid[0])
        mod=10**9+7
        dp=[[0] * c for _ in range(r)]
        dp1=[[0] * c for _ in range(r)]
        dp[0][0]=1
        for i in range(r):
            for j in range(c):
                if i==0 and j==0:
                    continue

                if i>0:
                    if grid[i-1][j]==0:
                        dp1[i][j]+=dp[i-1][j]+dp1[i-1][j]
                    else:
                        dp1[i][j]+=dp[i-1][j]
                if j>0:
                    if grid[i][j-1]==0:
                        dp[i][j]+=dp[i][j-1]+dp1[i][j-1]
                    else:
                        dp[i][j]+=dp1[i][j-1]
                dp[i][j]%=mod
                dp1[i][j]%=mod
        return (dp[r-1][c-1] + dp1[r-1][c-1]) % mod
