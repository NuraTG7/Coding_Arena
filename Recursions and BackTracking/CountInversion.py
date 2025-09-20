
def Merge(arr, low, mid, high):
    left, right = low, mid + 1
    temp = []
    global cnt  #mod 1
    while left <= mid and right <= high:
        if arr[left] <= arr[right]:
            temp.append(arr[left])
            left += 1
        else:
            temp.append(arr[right])
            cnt += (mid - left + 1) #modification 2
            right += 1

    while left <= mid:
        temp.append(arr[left])
        left += 1
    while right <= high:
        temp.append(arr[right])
        right += 1
    
    for i in range(low, high + 1, 1):
        arr[i] = temp[i - low]

def mS(arr, low, high):
    if low >= high:
        return
    mid = (low+high) // 2
    mS(arr, low, mid)
    mS(arr, mid+1, high)
    Merge(arr, low, mid, high)

arr = [5,3,2,4,1]
n = len(arr)
cnt = 0
mS(arr, 0, n-1)
print(arr)
print(cnt)