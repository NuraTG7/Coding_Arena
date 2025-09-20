def find_subsets(index, nums, ds, ans):
    ans.append(ds[:])  # Add the current subset to ans
    for i in range(index, len(nums)):
        if i > index and nums[i] == nums[i - 1]:  # Skip duplicates
            continue
        ds.append(nums[i])  # Include current element
        find_subsets(i + 1, nums, ds, ans)  # Recursive call
        ds.pop()  # Remove last element to backtrack

nums = [1, 1, 1, 2, 2]
ans = []
nums.sort()  # Sort to handle duplicates
find_subsets(0, nums, [], ans)
print(ans)
