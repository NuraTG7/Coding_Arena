text = "nlaebolko"
s = {}

for i in text:
    if i in 'baloon':
        s[i] += 1

if any(i not in 'baloon' for i in s):
    print( 0)
else:
    print(min(s['b'], s['a'], s['n'], s['l'] // 2, s['o'] // 2))