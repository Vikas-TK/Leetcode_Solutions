class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        se=set()
        l=ans=r=0
        
        while r<len(s):
            while s[r] in se:
                se.remove(s[l])
                l+=1
            se.add(s[r])
            ans=max(ans,r-l+1)
            r+=1
        return ans
