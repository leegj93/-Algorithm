from collections import deque

N = int(input())
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

apt = []
Amap = [list(input()) for _ in range(N)]

def bfs(i, k):
    queue= deque()
    queue.append((i, k))
    Amap[i][k]= '0'
    cnt = 1
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= N or ny < 0 or ny >= N:
                continue
            if Amap[nx][ny]=='1':
                Amap[nx][ny]='0'
                cnt += 1
                queue.append((nx, ny))
    return cnt

for i in range(N):
    for k in range(N):
        if Amap[i][k]=='1':
            apt.append(bfs(i, k))
print(len(apt))

apt.sort()
for i in apt:
    print(i)
    


    
  
