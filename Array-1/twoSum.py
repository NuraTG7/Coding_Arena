# lst = [2, 4, 8, 3, 1, 6]
# target = 7

# n = len(lst)

# for i in range(n):
#     for j in range(i+1, n):
#         if (lst[i]+lst[j]) == target:
#             print(i,j)


#tc:o(n)^2
#sc:o(1)

lst = [2, 4, 8, 3, 1, 6]
target = 7

n = len(lst)
s = set()

s = []

for i in range(n):
    curr = target - lst[i]
    if curr in s:
        print(s.index(curr), i)
    else:
        s.append(lst[i])

# TC : O(n) + o(n) = O(n)