def jump(nums):
    max_ind = 0
    for i in range(len(nums)):
        if i > max_ind:
            return False
        max_ind = max(max_ind, i+nums[i])
    return True


nums = [1, 2, 4, 1, 1, 0, 2, 5]
print(jump(nums))