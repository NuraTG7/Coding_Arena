#Approach 1

def countFreq(lst, n):
    visited = [False] * n
    minEle = maxEle = 0
    minFreq = n
    maxFreq = 0

    for i in range(n):
        if visited[i]:
            continue
        
        count = 1
        for j in range(i+1, n):
            if lst[i] == lst[j]:
                visited[j] = True
                count += 1
        
        if count < minFreq:
            minEle = lst[i]
            minFreq = count
        if count > maxFreq:
            maxEle = lst[i]
            maxFreq = count

    print(minEle, maxEle)


n = int(input())
lst = list(map(int, input().split()))
countFreq(lst, n)

