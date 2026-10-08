class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        res=[]
        c=0
        for ch in s:
            if ch=='(':
                if c>0:
                    res.append(ch)
                c+=1
            else:
                c-=1
                if c>0:
                    res.append(ch)
        return ''.join(res) 
