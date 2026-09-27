class Solution:
    def canFinish(self, n: int, a: list[list[int]]) -> bool:
        indegree=[0]*(n+1)
        g=[[] for _ in range(n)]
        for u,v in a:
            g[u].append(v)
            indegree[v]+=1

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

        if len(st)==n:
            return True
        else:
            return False
