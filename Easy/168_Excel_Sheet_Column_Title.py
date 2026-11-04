class Solution(object):
    def convertToTitle(self, num):
        """
        :type columnNumber: int
        :rtype: str
        """
        return "" if num == 0 else self.convertToTitle((num - 1) / 26) + chr((num - 1) % 26 + ord('A'))
