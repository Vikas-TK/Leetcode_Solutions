class Solution:
    def intervalIntersection(self, f: List[List[int]], se: List[List[int]]) -> List[List[int]]:
        i=0
        j=0
        ans=[]
        while i<len(f) and j<len(se):
            s=max(f[i][0],se[j][0])
            e=min(f[i][1],se[j][1])
            if s<=e:
                ans.append([s, e])
            if f[i][1]<se[j][1]:
                i+=1
            else:
                j+=1
        return ans
