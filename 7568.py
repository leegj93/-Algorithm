N= int(input())

people=[list(map(int,input().split()))for _ in range(N)]

rank_list=[1]*N

for i in range(len(people)):
    for k in range(len(people)):
        if(people[i][0] !=people[k][0] and people[i][1] != people[k][1]):
            if(people[i][0]> people[k][0] and people[i][1] > people[k][1]):
                rank_list[k]+=1
print(*rank_list)