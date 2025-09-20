intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]]
newInt = [4,8]
result = []

i = 0
n = len(intervals)
while i <n and newInt[0] > intervals[i][-1]:
    result.append(intervals[i])
    i+=1

while i < n and newInt[-1] >= intervals[i][0]:
    newInt[0] = min(intervals[i][0], newInt[0])
    newInt[-1] = max(intervals[i][-1], newInt[1])
    i += 1
result.append(newInt)

while i < n:
    result.append(intervals[i])
    i += 1

print(result)