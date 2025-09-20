def solve(col, leftRow, upperDiag, lowerDiag):
    if col == n:
        return 1
    count = 0
    for row in range(n):
        if not leftRow[row] and not upperDiag[row + col] and not lowerDiag[row - col + n - 1]:
            leftRow[row] = upperDiag[row + col] = lowerDiag[row - col + n - 1] = True
            count += solve(col + 1, leftRow, upperDiag, lowerDiag)
            leftRow[row] = upperDiag[row + col] = lowerDiag[row - col + n - 1] = False    
    return count

n  = int(input())
leftRow = [False] * n
upperDiag = [False] * (2 * n - 1)
lowerDiag = [False] * (2 * n - 1)
result =  solve(0, leftRow, upperDiag, lowerDiag)
print(result)
