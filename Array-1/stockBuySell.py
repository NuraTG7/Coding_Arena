"""
Example 1:
Input:
 prices = [7,1,5,3,6,4]
Output:
 5
Explanation:
 Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note
: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

"""

import sys

prices = [7,1,5,3,6,4,8]
mini = sys.maxsize
maxPrice = 0

for i in range(len(prices)):
    mini = min(mini, prices[i])
    maxPrice = max(maxPrice, prices[i] - mini)    
print(mini, maxPrice)
