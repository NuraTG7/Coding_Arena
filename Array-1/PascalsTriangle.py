"""
Example 1:

Input Format:
 N = 5, r = 5, c = 3
Result:
 6 (for variation 1)
1 4 6 4 1 (for variation 2)

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1    (for variation 3)

Explanation:
    There are 5 rows in the output matrix.
Each row is formed using the logic of Pascal’s triangle.

"""
def generateRow(row):
    v = 1
    ansRow = [1] #inserting the 1st element
    
    #calculate the rest of the elements:
    for col in range(1, row):
        v *= (row - col) 
        v //= col
        ansRow.append(v)
    return ansRow

def pascalTriangle(n, ans):
    #store the entire pascal's triangle:
    for row in range(1, n+1):
        ans.append(generateRow(row))


n = 5
ans = []
pascalTriangle(n, ans)
for it in ans:
    for ele in it:
        print(ele, end=" ")
    print()

