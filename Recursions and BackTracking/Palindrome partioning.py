def is_palindrome(s, start, end):
    while start <= end:
        if s[start] != s[end]:
            return False
        start += 1
        end -= 1
    return True

def func(index, s, path, res):
    if index == len(s):
        res.append(path[:])
        return

    for i in range(index, len(s)):
        if  s[index : i+1] == s[index : i+1][::-1]:
            
            path.append(s[index:i+1])  # Extract substring
            func(i+1, s, path, res)
            path.pop()  # Backtrack
print()
s = "aabbaa"
res = []
path = []
func(0, s, path, res)
print(res)
