class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        
        capacity.sort(reverse = True)
        c = cap = 0
        for i in capacity:
            if(cap >= sum(apple)):
                return c
            else:
                cap += i
            c += 1
        return c