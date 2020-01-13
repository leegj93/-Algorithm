V = int(input())
E = int(input())

matrix =[[0]*(V+1) for _ in range(V+1)]

for _ in range(E):
    link = list(map(int, input().split()))
    matrix[link[0]][link[1]] = 1
    matrix[link[1]][link[0]] = 1

def bfs(start):
    queue = [start]
    foot_prints = [start]
    cnt = 0
    while queue:
        current_node= queue.pop(0)
        for search_node in range(len(matrix[current_node])):
            if matrix[current_node][search_node] and search_node not in foot_prints:
                foot_prints += [search_node]
                queue += [search_node]
                cnt +=1
    return cnt

print(bfs(1))

