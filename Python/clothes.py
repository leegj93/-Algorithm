import collections

def solution(clothes):
    counter_category = collections.Counter([category for _, category in clothes])
    answer= 1
    for key in counter_category:
        answer *= (counter_category[key]+1)
    return answer -1

# 다른 사람 풀이


def solution(clothes):
    from collections import Counter
    from functools import reduce
    cnt = Counter([kind for name, kind in clothes])
    answer = reduce(lambda x, y: x*(y+1), cnt.values(), 1) - 1
    
    return answer

clothes=[["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]

solution(clothes)


