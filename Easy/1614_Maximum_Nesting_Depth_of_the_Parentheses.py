class Solution:
    def maxDepth(self, s: str) -> int:
        n=len(s)
        c=0
        mx=0
        for i in range(n):
            if s[i]=='(':
                c+=1
            elif s[i]==')':
                c-=1
            mx=max(c,mx)

        return mx
