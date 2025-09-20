def maxMeetings(s, e, n):
    meetings = [(s[i], e[i], i + 1) for i in range(n)]
    meetings.sort(key = lambda x: (x[1], x[2]))
    
    answer = []
    limit = meetings[0][1]
    answer.append(meetings[0][2])
    
    for i in range(1, n):
        if meetings[i][0] > limit:
            limit = meetings[i][1]
            answer.append(meetings[i][2])
    
    print("The order in which the meetings will be performed is:")
    print(" ".join(map(str, answer)))

n = 6
start = [1, 3, 0, 5, 8, 5]
end = [2, 4, 5, 7, 9, 9]
maxMeetings(start, end, n)