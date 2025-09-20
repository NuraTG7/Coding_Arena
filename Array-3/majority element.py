"""
from collections import Counter

nums = [2,2,1,1,1,2,2]
n = len(nums)
counter = Counter(nums)
print(counter.items())

for num, count in counter.items():
    if count > n//2:
        print(num)
        break
else:
    print("False")
    """


#Moores voting algorithm

def majorityElement(arr):
    # Size of the given array
    n = len(arr)
    cnt = 0  # Count
    el = None  # Element
    
    # Applying the algorithm
    for i in range(n):
        if cnt == 0:
            cnt += 1
            el = arr[i]
        elif arr[i] == el:
            cnt += 1
        else:
            cnt -= 1

    cnt1 = 0
    for i in range(n):
        if arr[i] == el:
            cnt1 += 1
        
        if cnt1 > n//2:
            return el
    return -1


arr = [2, 2, 1, 1, 1, 2, 2]
ans = majorityElement(arr)
print("The majority element is:", ans)

