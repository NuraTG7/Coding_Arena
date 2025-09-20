

def find_combination(ind, target, arr, ans, ds):
    if ind == len(arr):
        if target == 0:
            ans.append(ds[:])
        return
    if arr[ind] <= target:
        ds.append(arr[ind])
        find_combination(ind, target - arr[ind], arr, ans, ds)
        ds.pop()
    find_combination(ind + 1, target, arr, ans, ds)

def combination_sum(candidates, target):
    ans = []
    ds = []
    find_combination(0, target, candidates, ans, ds)
    return ans

candidates = [2, 3, 6, 7]
target = 20
print(combination_sum(candidates, target))
