
def is_safe(row, col, board, n):
    r, c = row, col
    while r >= 0 and c >= 0:
        if board[r][c] == 'Q':
            return False
        r -= 1
        c -= 1

    c = col
    while c >= 0:
        if board[row][c] == 'Q':
            return False
        c -= 1

    r, c = row, col
    while r < n and c >= 0:
        if board[r][c] == 'Q':
            return False
        r += 1
        c -= 1
    return True

def solve(col, board, ans, n):
    if col == n:
        ans.append(["".join(row) for row in board])
        return
    
    for row in range(n):
        if is_safe(row, col, board, n):
            board[row][col] = 'Q'  # Place queen
            solve(col + 1, board, ans, n)
            board[row][col] = '.'  # Backtrack

def solveNQueens(n):
    ans = []
    board = [['.' for _ in range(n)] for _ in range(n)]  # Initialize board
    solve(0, board, ans, n)
    return ans

n = 8
solutions = solveNQueens(n)
for sol in solutions:
    for row in sol:
        print(row)
    print()
