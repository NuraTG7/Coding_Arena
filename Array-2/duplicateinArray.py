arr=[1,3,4,2,2]

s = set()

for x in arr:
    if x not in s:
        s.add(x)
    else:
        print(x)