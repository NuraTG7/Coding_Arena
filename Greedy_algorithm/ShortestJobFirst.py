jobs = [5, 2, 1, 4, 3]
jobs.sort()

val = 0
t = 0
for i in jobs:
    val += t
    t += i
    print(val)
print(val/ len(jobs))
