class Item:
    def __init__(self, value, weight):
        self.value = value
        self.weight = weight

def fractional_knapsack(W, items):
    # Sort items by value-to-weight ratio in descending order using lambda
    items.sort(key=lambda item: item.value / item.weight, reverse=True)

    cur_weight = 0  
    final_value = 0.0  

    for item in items:
        if cur_weight + item.weight <= W:
            cur_weight += item.weight
            final_value += item.value
        else:
            remain = W - cur_weight
            final_value += (item.value / item.weight) * remain
            break  

    return final_value

# Example usage
items = [Item(60, 10), Item(100, 20), Item(120, 30)]
print(items[0].weight)
W = 50
max_value = fractional_knapsack(W, items)
print(f"Maximum value in Knapsack = {max_value:.2f}")


"""
def fractional_knapsack(W, items):
    items.sort(key=lambda item: item[0] / item[1], reverse=True)
    cur_weight = 0  
    final_value = 0.0  

    for item in items:
        if cur_weight + item[1] <= W:
            cur_weight += item[1]
            final_value += item[0]
        else:
            remain = W - cur_weight
            final_value += (item[0] / item[1]) * remain
            break  

    return final_value

# Example usage
value = [60, 100, 120]
weight = [10, 20, 30]
items = list(zip(value, weight))
print(items)
W = 50
max_value = fractional_knapsack(W, items)
print(f"Maximum value in Knapsack = {max_value:.2f}")


"""