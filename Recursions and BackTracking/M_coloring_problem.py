def isSafe(node, color, graph, n, col):
    for k in range(n):
        if k != node and graph[node][k] == 1 and color[k] == col:
            return False
    return True

def solve(node, color, m, N, graph):
    if node == N:
        return True
    for i in range(1, m + 1):
        if isSafe(node, color, graph, N, i):
            color[node] = i
            if solve(node + 1, color, m, N, graph):
                return True
            color[node] = 0
    return False

N = 4
m = 3
graph = [[0 for i in range(N+1)] for j in range(N+1)]

# Edges are (0, 1), (1, 2), (2, 3), (3, 0), (0, 2)
for _ in range(N+1):
    u, v = map(int, input().split())
    graph[u][v] = graph[v][u] = 1

for v in graph:
    print(v)

# Function to determine if graph can be coloured with at most M colours such
# that no two adjacent vertices of graph are coloured with same colour.

color = [0] * N
print(1 if solve(0, color, m, N, graph) else 0)
print(color)