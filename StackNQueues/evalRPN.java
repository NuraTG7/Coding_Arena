class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stk = []

        for i in tokens:
            if i in "/*+-"":
                b, a = stk.pop(), stk.pop()
                if i == '+':
                    stk.append(a+b)
                elif i=='-':
                    stk.append(a-b)
                elif i == '*':
                    stk.append(a*b)
                else:
                    div = a/b
                    if div > 0:
                        stk.append(math.floor(div))
                    else:
                        stk.append(math.ceil(div))
            else:
                stk.append(int(i))
        return stk.pop()
                    
