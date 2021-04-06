
def coin_change(change):
    coin=[1,4,6]
    dp=[0]*change
    for N in range(1, change):
        min=99999
        for i in range(len(coin)):
            if N >= coin[i]:
                ret=dp[N-coin[i]]
                if min > ret:
                    min = ret
                dp[N]=min+1
    print(dp[change-1])
            


coin_change(8)