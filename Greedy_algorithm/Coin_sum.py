coins = [1, 2, 5, 10, 20, 50, 100, 500, 1000]
v = int(input())
ans = []

for i in range(len(coins)-1, -1, -1):
    while v >= coins[i]:
        v -= coins[i]
        ans.append(coins[i])

print(ans)