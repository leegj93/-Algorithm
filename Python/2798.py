from itertools import combinations

n, m= map(int, input().split())

cdn = list(map(int, input().split()))

min_sum=0

for num in combinations(cdn,3):
    temp=int(sum(num))
    if temp <=m and min_sum < temp:
        min_sum= temp
print(min_sum)

