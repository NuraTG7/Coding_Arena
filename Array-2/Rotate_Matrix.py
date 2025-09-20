#Brute Approach
"""
mat = [[1, 2, 3], [4,5,6], [7,8,9]]
n = len(mat)
ans = [[0]*n for _ in range(n)]

for i in range(n):
    for j in range(n):
        ans[j][n-i-1] = mat[i][j]

for i in ans:
    print(*i)

    
#TC : O(N^2)+O(N^2)    
#SC : O(N^2)
"""    

#optimal (Transpose matrix, reverse rows)
"""
mat = [[1, 2, 3], [4,5,6], [7,8,9]]
n = len(mat)

for i in range(n-1):
    for j in range(i, n):
        mat[i][j], mat[j][i] = mat[j][i], mat[i][j]

for i in mat:
    mat[i] = mat[::-1]

for i in mat:
    print(*i)

#TC : O(N^2)
#SC : O(1)

"""