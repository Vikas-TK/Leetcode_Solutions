class Solution:
    def isPerfectSquare(self, num) -> bool:
        return int(math.sqrt(num))**2==num
