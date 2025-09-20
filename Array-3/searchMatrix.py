# def binarySearch(lst, target):
#     n = len(lst)
#     low, high = 0, n-1
    
#     while low <= high:
#         mid = (low+high) // 2
#         if lst[mid] == target:
#             return True
#         elif lst[mid] > target:
#             high = mid - 1
#         else:
#             low = mid + 1
#     return False

# def searchmatrix(mat, target):
#     n = len(mat)
#     m = len(mat[0])

#     row = -1

#     for i in range(n):
#         if mat[i][0] <= target <= mat[i][-1]: 
#             return binarySearch(mat[i], target)
#     return False

# mat = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
# target = 3

# print(searchmatrix(mat, target))

#Approach 2

def searchmatrix(mat, target):
    n = len(mat)
    m = len(mat[1])
    low, high = 0, n*m-1

    while low <= high:
        mid = (low+high) // 2
        val = mat[mid // m][mid % m]
        if val == target:
            return True
        elif val < target:
            high = mid-1
        else:
            low = mid+1
    return True

mat = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 3

print(searchmatrix(mat, target))