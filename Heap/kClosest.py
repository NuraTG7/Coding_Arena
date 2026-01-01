class Solution(object):
    def kClosest(self, points, k):
        """
        :type points: List[List[int]]
        :type k: int
        :rtype: List[List[int]]
        """
        heap = []

        for x, y in points:
            d = x**2 + y**2
            if len(heap) < k:
                heappush(heap,(-d,x,y))
            else:
                heappushpop(heap,(-d,x,y))
        return [(x,y) for d,x,y in heap]