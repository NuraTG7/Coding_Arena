def f(i, lst):
    if i >= len(arr):
        print(lst, end =' ')
        return
    lst.append(arr[i])
    f(i+1, lst)
    lst.remove(arr[i])
    f(i+1, lst)

arr = [1,2,2]
v = []
f(0, v)

'''
TC : 2**n * n
SC : O(n)
'''