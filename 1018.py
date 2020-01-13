N, M = map(int, input().split())
board = [input() for _ in range(N)]
min_number = 99999
check_colors=['B', 'W']
for i in range(N - 7):
    for k in range(M - 7):
        for color in range(2):
            cnt = 0
            for u in range(i, i + 8):
                for w in range(k, k + 8):
                    if board[u][w] != check_colors[color%2]:
                        cnt +=1
                    color +=1
                color +=1
            if cnt < min_number:
                min_number=cnt
print(min_number)