s = "aaaaaaa"
worddict = ["aaaa","aaa"]

n = len(s)
i = j = 0

while i < n and j < n+1:
    print(i, j, s[i:j])
    if s[i:j] in worddict:
        i = j
    j += 1

if i == n: print(True)
else:print(False)