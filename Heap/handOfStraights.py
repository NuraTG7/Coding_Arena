class Solution(object):
    def isNStraightHand(self, hand, groupsize):
        if len(hand)%groupsize!=0:
            return False
        
        count = Counter(hand)
        minHeap = list(count.keys())
        heapq.heapify(minHeap)

        while minHeap:
            first = minHeap[0]

            for i in range(first, first+groupsize):
                if count[i] == 0:
                    return False
                count[i] -=1
                if count[i] == 0:
                    
                    heapq.heappop(minHeap)
        return True
                
        