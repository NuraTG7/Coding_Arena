"""
def jump(ind, jumps, n):
    if ind >= n-1:
        return jumps
    mini = float('inf')
    for i in range(1, nums[ind]+1):
        mini = min(mini, jump(ind+i, jumps+1, n))
    return mini


nums = [1, 2, 4, 1, 1, 0, 2, 5]
n = len(nums)
print(jump(0, 0, n))

# TC: 2^N
# SC: O(N)

"""

