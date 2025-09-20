"""
Problem Statement: Given an array of intervals, merge all the overlapping intervals and return an array of non-overlapping intervals.

Example 1:
Input:
 intervals=[[1,3],[2,6],[8,10],[15,18]]

Output:
 [[1,6],[8,10],[15,18]]

Explanation:
 Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6]
 intervals.

 """
def mergeOverlappingIntervals(arr):
    ans = []
    n = len(arr)
    arr.sort()

    for i in range(n):
        if not ans or arr[i][0] > ans[-1][1]:
            ans.append(arr[i])
            print(arr, ans) 
        else:
            ans[-1][1] = max(ans[-1][1], arr[i][1])
    return ans


arr = [[1, 3], [8, 10], [2, 6], [15, 18]]
ans = mergeOverlappingIntervals(arr)
print("The merged intervals are:")
for it in ans:
    print(f"[{it[0]}, {it[1]}]", end=" ")
print()


