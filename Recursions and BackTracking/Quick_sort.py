import random
def partition(arr, low, high):
    pivot = arr[low]
    i, j = low, high
    while i < j:
        while i < high and arr[i] <= pivot:
            i += 1
        while arr[j] > pivot:
            j -= 1
        if i < j:
            arr[i], arr[j] = arr[j], arr[i]
    arr[low], arr[j] = arr[j], arr[low]
    return j

def quick_sort(arr, low, high):
    if low < high:
        p_index = partition(arr, low, high)
        quick_sort(arr, low, p_index - 1)
        quick_sort(arr, p_index + 1, high)

arr = [random.randint(1, 20) for i in range(10)]
print(arr)
quick_sort(arr, 0, len(arr)-1)
print(arr)