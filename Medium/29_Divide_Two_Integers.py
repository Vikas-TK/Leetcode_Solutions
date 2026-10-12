class Solution:
    def divide(self, a: int, b: int) -> int:
        if a == b:
            return 1

        if a == -(2**31) and b == -1:
            return (2**31) - 1

        if b == 1:
            return a

        s = -1 if (a < 0) ^ (b < 0) else 1
        n, d = abs(a), abs(b)
        ans = 0

        while n >= d:
            p = 0

            while n >= (d << p):
                p += 1

            p -= 1
            n -= (d << p)
            ans += (1 << p)

        result = ans if s == 1 else -ans

        return min(max(result, -(2**31)), (2**31) - 1)
