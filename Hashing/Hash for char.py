# def gethas(s):
#     n = len(s)
#     hasArr = [0]*26
#     for i in range(n):
#         hasArr[ord(s[i])-97] += 1
    
#     return hasArr

# s = 'nurathamass'
# print(ord('n')-65)
# result = gethas(s)
# print(result)

#Modifieedd

# Input size of array
n = int(input())
arr = list(map(int, input().split()))

# Pre-compute frequencies using a dictionary
mpp = {}
for num in arr:
    mpp[num] = mpp.get(num, 0) + 1

# Input number of queries
q = int(input())
for _ in range(q):
    number = int(input())
    print(mpp.get(number, 0))
