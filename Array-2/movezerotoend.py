"""
nums = [0,1,0,3,12]

i = 1
j = -1
n = len(nums)

for i in range(n):
    if not nums[i]:
        j = i
        break

if j != -1:
    while i < n and j < n:
        if nums[i] and not nums[j]:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j += 1
        else:
            i += 1

print(nums)

"""

nums = [0,1,0,3,12]
n = len(nums)
c = 0
for i in range(n):
    if nums[i] != 0:
        nums[i],nums[c] = nums[c],nums[i]
        c += 1
print(nums)