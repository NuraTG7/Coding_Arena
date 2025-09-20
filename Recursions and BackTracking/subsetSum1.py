def func(ind, sum, arr, N, sumset):
    if ind == N:
        sumset.append(sum)
        return
    func(ind + 1, sum + arr[ind], arr, N, sumset)
    func(ind + 1, sum, arr, N, sumset)

arr= [i for i in range(1, 100)]
sumset = []
n = len(arr)
func(0, 0, arr, n, sumset)
sumset.sort()
print(sumset)
