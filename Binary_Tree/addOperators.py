class Solution:
    def addOperators(self, num: str, target: int) -> List[str]:
        def dfs(expr, value, last, index):
            if index == len(num):
                if target == value:
                    res.append(expr)                    
                    return
            
            for i in range(index, len(num)):
                if i != index and num[index]=='0':
                    break
                curr = int(num[index:i+1])

                if index == 0:
                    dfs(str(curr), curr, curr, i+1)
                else:
                    dfs(expr + '+' + str(curr), value + curr, curr, i+1)
                    dfs(expr + '-' + str(curr), value - curr, -curr, i+1)
                    dfs(expr + '*' + str(curr), value - last + last * curr, curr*last, i+1)
                    
        res = []
        dfs('', 0, 0, 0)
        return res
        