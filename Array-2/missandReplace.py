#Sum logic
arr = [3,1,2,5,3]
n = len(arr)

Sn = (n*(n+1)) // 2
Sn2 = (n*(n+1)*(2*n+1)) // 6

S = S2 = 0

for i in range(n):
    S += arr[i]
    S2 += arr[i] * arr[i]

val1 = S - Sn
val2 = S2 - Sn2

val2 = val2 // val1


missing = (val1 + val2) // 2
replaced = missing - val1

print(missing, replaced)