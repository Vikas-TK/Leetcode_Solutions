class Solution:
    def eraseOverlapIntervals(self, a: List[List[int]]) -> int:
        a.sort(key=lambda x:x[1])
        c=0
        le=a[0][1]
        for s,e in a[1:]:
            if s<le:
                c+=1
            else:
                le=e
        return c
