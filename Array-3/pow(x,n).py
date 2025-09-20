def pow(x, n):
    if n < 0:
        nn = -n
    else:
        nn = n
    ans = 1

    while nn > 0:
        if nn % 2:
            ans = ans * x
            nn -= 1
        else:
            x = x * x
            nn /= 2
    if n < 0:
        return -ans
    else:
        return ans

print(pow(2.00000, 10))