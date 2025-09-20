def solve(col, board, ans, leftRow, upperDiagonal, lowerDiagonal, n):
    if col == n:
        ans.append(["".join(v) for v in board])
        return
    for row in range(n):
        if leftRow[row] == upperDiagonal[row+col] == lowerDiagonal[n-1+col-row] == 0:
            board[row][col] = 'Q'
            leftRow[row] = upperDiagonal[row + col] = lowerDiagonal[n-1+col-row] = 1
            solve(col + 1, board, ans, leftRow, upperDiagonal, lowerDiagonal, n)
            board[row][col] = '.'
            leftRow[row] = upperDiagonal[row + col] = lowerDiagonal[n-1+col-row] = 0

n = 9
ans = []
board = [["." for _ in range(n)] for _ in range(n)]
leftRow = [0] * n
upperDiagonal = [0] * (2*n - 1)
lowerDiagonal = [0] * (2*n - 1)
solve(0, board, ans, leftRow, upperDiagonal, lowerDiagonal, n)
# for sol in ans:
#     for row in sol:
#         print(row)
#     print()

print(len(ans))