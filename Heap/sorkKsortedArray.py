import heapq

def sortK(arr, n, k):
    heap = []
    res = []

    for i in range(k+1):
        heapq.heappush(heap, arr[i])
    
    for i in range(k+1, n):
        res.append(heapq.heappop(heap))
        heapq.heappush(heap, arr[i])

    while heap:
        res.append(heapq.heappop(heap))
    return res


k = 3
arr = [2, 6, 3, 12, 56, 8]

n = len(arr)
res = sortK(arr, n, k)
print(res)