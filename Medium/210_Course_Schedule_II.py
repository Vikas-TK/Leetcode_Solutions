from collections import deque
class Solution:
    def findOrder(self, n: int, a: list[list[int]]) -> list[int]:
        indegree=[0]*n
        g=[[] for _ in range(n)]
        for u,v in a:
            g[v].append(u)
            indegree[u]+=1

        q=deque()
        for i in range(n):
            if indegree[i]==0:
                q.append(i)

        st=[]
        while q:
            node=q.popleft()
            st.append(node)
            for nei in g[node]:
                indegree[nei]-=1
                if indegree[nei]==0:
                    q.append(nei)

        return st if len(st)==n else []
