import sys
prices = [7,1,5,3,6,4]

mini = sys.maxsize
maxi = 0

for i in prices:
    mini = min(mini, i)
    maxi = max(i-mini, maxi)

print(maxi)