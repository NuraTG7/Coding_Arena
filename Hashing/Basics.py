def getHash(arr, n, m):
    hashArray = [0]* (11)
    for i in range(n):
        hashArray[arr[i]] += 1
    return hashArray

n = int(input())
arr = list(map(int, input().split()))
m = int(input())
elementToFind = list(map(int, input().split()))

hashArray = getHash(arr, n, m)
print(hashArray)

for i in elementToFind:
    print(hashArray[i])
    m -= 1