def f(i, lst, s, target):
    if i == len(arr):
        if s == target:
            print(lst)
        return

    lst.append(arr[i])
    f(i + 1, lst, s + arr[i], target)
    
    lst.pop()
    f(i + 1, lst, s, target)

arr = [1, 2, 1]
target = 2
v = []
f(0, v, 0, target)
