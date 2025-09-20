arrival = [50, 120, 550, 200, 700, 850]
departure = [500, 550, 600, 700, 900, 1000]
arrival.sort()
departure.sort()
n = len(arrival)

platform = 1
result = 1
i, j = 1, 0
while(i < n and j < n):
    print(arrival[i], departure[j], platform)
    if arrival[i] <= departure[j]:
        platform += 1
        i += 1
        
    elif (arrival[i] > departure[j]):
        platform -= 1
        j += 1
    
    if platform > result :
        result = platform

print(result)