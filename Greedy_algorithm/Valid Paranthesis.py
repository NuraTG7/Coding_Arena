s = '())('

cnt = 0

for i in range(len(s)):
    if s[i] == '(':
        cnt += 1
    if s[i] == ')':
        cnt -= 1
    if cnt < 0:
        print('False')
        break
print('True')
