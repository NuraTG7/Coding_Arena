#Code 1
"""
def findPathHelper(i, j, a, n, ans, move, vis):
    if i == n - 1 and j == n - 1:
        ans.append(move)
        return

    # downward
    if i + 1 < n and vis[i + 1][j] == 0 and a[i + 1][j] == 1:
        vis[i][j] = 1
        findPathHelper(i + 1, j, a, n, ans, move + 'D', vis)
        vis[i][j] = 0

    # left
    if j - 1 >= 0 and not vis[i][j - 1] and a[i][j - 1] == 1:
        vis[i][j] = 1
        findPathHelper(i, j - 1, a, n, ans, move + 'L', vis)
        vis[i][j] = 0

    # right
    if j + 1 < n and not vis[i][j + 1] and a[i][j + 1] == 1:
        vis[i][j] = 1
        findPathHelper(i, j + 1, a, n, ans, move + 'R', vis)
        vis[i][j] = 0

    # upward
    if i - 1 >= 0 and not vis[i - 1][j] and a[i - 1][j] == 1:
        vis[i][j] = 1
        findPathHelper(i - 1, j, a, n, ans, move + 'U', vis)
        vis[i][j] = 0


def findPath(m, n):
    ans = []
    vis = [[0 for _ in range(n)] for _ in range(n)]

    if m[0][0] == 1:
        findPathHelper(0, 0, m, n, ans, "", vis)
    return ans

n = 4
m = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]

result = findPath(m, n)
if len(result) == 0:
    print(-1)
else:
    for i in range(len(result)):
        print(result[i], end=" ")

"""

#Code 2

def solve(i, j, a, n, ans, move, vis, di, dj):
    if i == n - 1 and j == n - 1:
        ans.append(move)
        return

    directions = "DLRU"
    for ind in range(4):
        nexti = i + di[ind]
        nextj = j + dj[ind]
        if 0 <= nexti < n and 0 <= nextj < n and not vis[nexti][nextj] and a[nexti][nextj] == 1:
            vis[i][j] = 1
            solve(nexti, nextj, a, n, ans, move + directions[ind], vis, di, dj)
            vis[i][j] = 0

def findPath(m, n):
    ans = []
    vis = [[0] * n for _ in range(n)]
    di = [1, 0, 0, -1]
    dj = [0, -1, 1, 0]
    
    if m[0][0] == 1:
        solve(0, 0, m, n, ans, "", vis, di, dj)
    
    return ans

n = 4
m = [[1, 0, 0, 0], 
        [1, 1, 0, 1], 
        [1, 1, 0, 0], 
        [0, 1, 1, 1]]

result = findPath(m, n)
print(-1 if not result else " ".join(result))
