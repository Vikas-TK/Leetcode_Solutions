from collections import deque
class Solution:
    def checkIfPrerequisite(self, n: int, a: list[list[int]], q: list[list[int]]) -> list[bool]:
        g=[[] for _ in range(n)]
        ind=[0]*n
        for u,v in a:
            g[u].append(v)
            ind[v]+=1
        re=[[False] * n for _ in range(n)]
        qe=deque()
        for i in range(n):
            if ind[i]==0:
                qe.append(i)

        while qe:
            node=qe.popleft()
            for v in g[node]:
                re[node][v]=True
                for i in range(n):
                    if re[i][node]:
                        re[i][v]=True
                ind[v]-=1
                if  ind[v]==0:
                    qe.append(v)
        ans=[]
        for u,v in q:
            ans.append(re[u][v])
        return ans
