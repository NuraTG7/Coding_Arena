#Brute Force

"""
def merge(arr1, arr2, n, m):

    # Declare a 3rd array and 2 pointers:
    arr3 = [0] * (n + m)
    left = 0
    right = 0
    index = 0

    # Insert the elements from the 2 arrays
    # into the 3rd array using left and right
    # pointers:


    while left < n and right < m:
        if arr1[left] <= arr2[right]:
            arr3[index] = arr1[left]
            left += 1
            index += 1
        else:
            arr3[index] = arr2[right]
            right += 1
            index += 1
        
    while left < n:
        arr3[index] = arr1[left]
        index += 1
        left += 1
    
    while right < m:
        arr3[index] = arr2[right]
        index += 1
        right += 1

    for i in range(n + m):
        if i < n:
            arr1[i] = arr3[i]
        else:
            arr2[i - n] = arr3[i]

arr1 = [1, 4, 8, 10]
arr2 = [2, 3, 9]
n = 4
m = 3
merge(arr1, arr2, n, m)

print("The merged arrays are:")
print("arr1[] = ", end="")
for i in range(n):
    print(arr1[i], end=" ")
print("\narr2[] = ", end="")
for i in range(m):
    print(arr2[i], end=" ")
print() 

"""

#Optimal1
"""
arr1 = [1, 4, 8, 10]
arr2 = [2, 3, 9]
n = 4
m = 3
i, j = n-1, 0

while i<n and j < m:
    if arr1[i] > arr2[j]:
        arr1[i], arr2[j] = arr2[j], arr1[i]
    else:
        break
    i-=1
    j += 1

for i in range(n):
    print(arr1[i], end=" ")
print("\narr2[] = ", end="")
for i in range(m):
    print(arr2[i], end=" ")

"""

"""
def swapgreat(ind1, ind2, arr1, arr2):
    if arr1[ind1] > arr2[ind2]:
        arr1[ind1], arr2[ind2] = arr2[ind2], arr1[ind1]

arr1 = [1, 4, 8, 10]
arr2 = [2, 3, 9]
n = 4
m = 3
len = n + m
gap = (len // 2) + (len % 2)

while gap > 0:
    left = 0
    right = left + gap
    while right < len:
        #Arr1 and Arr2
        if left < n and right >= n:
            swapgreat(left, right-n, arr1, arr2)

        #arr1 and arr1
        elif left >= n:
            swapgreat(left-n, right-n, arr2, arr2)

        #arr2 and arr2
        else:
            swapgreat(left, right, arr1, arr1)
        
        left += 1
        right += 1

    if gap == 1: break
    gap = (gap // 2) + (gap % 2)

print(arr1, arr2)

"""