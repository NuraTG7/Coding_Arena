def find_combinations(ind, target, arr, ans, ds):
    if target == 0:
        ans.append(ds)
        return
    for i in range(ind, len(arr)):
        if  i > ind and arr[i] == arr[i - 1] :
            continue
        if arr[i] > target:
            break
        ds.append(arr[i])
        find_combinations(i + 1, target - arr[i], arr, ans, ds)
        ds.pop()

candidates = sorted([1, 1, 2, 2])
target = 4
ans = []
find_combinations(0, target, candidates, ans, [])
print(ans)