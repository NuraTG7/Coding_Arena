class Solution:
    def countBits(self, n: int) -> List[int]:
        lst = [0]
        for i in range(1, n+1):
            lst.append((lst[i>>1])+(i&1))
        return lst