# Method One
""""""
def recur_permute(ds, nums, ans, freq):
    if len(ds) == len(nums):  # Base case: If permutation is complete
        ans.append(ds[:])  # Store a copy of ds
        return

    for i in range(len(nums)):
        if not freq[i]:  # If the number is not already picked
            ds.append(nums[i])  # Choose the number
            freq[i] = 1  # Mark as picked
            recur_permute(ds, nums, ans, freq)  # Recur
            freq[i] = 0  # Unmark (backtrack)
            ds.pop()  # Remove last element (backtrack)

# Example usage
nums = 'babab'
ans = []  # Store all permutations
ds = []  # Temporary list to hold current permutation
freq = [0] * len(nums)  # Frequency array to track used elements
recur_permute(ds, nums, ans, freq)
print(ans)  # Output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]

"""
"""
"""
def recurPermOpt(index, ans, nums):
    if len(nums) == index:
        ans.append(nums[:])
        return
    for i in range(index, len(nums), 1):
        nums[i], nums[index] = nums[index], nums[i]
        recurPermOpt(index + 1, ans, nums)
        nums[i], nums[index] = nums[index], nums[i]

ans = []
nums = [1,2,3,4]
recurPermOpt(0, ans, nums)
print(ans)

"""