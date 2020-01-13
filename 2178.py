def bfs():
    arr = []
    arr.append([0,0])
    visited[0][0] = 1
    while arr:
        cur = arr.pop(0)
        x = cur[0]
        y = cur[1]
        if cur == [N-1, M-1]:
            print(visited[x][y])
            break
        now = visited[x][y]
        for i in range(4):
            wx = x + dir[i][0]
            wy = y + dir[i][1]
            if wx >= N or wy >= M or wx <= 0 or wy <0:
                continue
            if visited[wx][wy] == 0 and map[wx][wy] == '1':
                visited[wx][wy] = now + 1
                arr.append([wx, wy])

N, M = map(int, input().split())
maze = [" "] * N
visited = [[0] * M for _ in range(M)]
dir = [[0, 1], [1, 0], [0, -1], [-1, 0]]

for i in range(N):
    maze.append(list(map(int, str(input()))))

bfs()
