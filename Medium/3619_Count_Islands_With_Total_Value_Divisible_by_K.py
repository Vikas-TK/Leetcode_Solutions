class Solution:
    def countIslands(self, g: List[List[int]], k: int) -> int:
        r=len(g)
        c=len(g[0])
        dire=[(1,0),(0,1),(-1,0),(0,-1)]
        q=deque()
        count=0
        for i in range(r):
            for j in range(c):
                if g[i][j]!=0:
                    q.append((i,j))
                    tot=g[i][j]
                    g[i][j]=0

                    while q:
                        x,y=q.popleft()
                        
                        for dx,dy in dire:
                            xx,yy=x+dx,y+dy
                            if 0<=xx<r and 0<=yy<c and g[xx][yy]!=0:
                                tot+=g[xx][yy]
                                q.append((xx,yy))
                                g[xx][yy]=0
                    if tot%k==0:
                        count+=1
        return count
