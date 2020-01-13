from collections import defaultdict
from collections import Counter

def solution(genres, plays):
    play_counter_by_genres= defaultdict(int)
    song_in_genres= defaultdict(list)

    for song, genre, play in zip(counter(), genres, plays):
        play_counter_by_genres[genre] += play
        song_in_genres[genre].append((-play, song))
    
    genre_inorder= sorted(play_counter_by_genres, key=lambda x: play_counter_by_genres[x], reverse=True)

    answer=list()

    for genre in genre_inorder:
        print(genre)
        answer.extend([song_id for minus_play, song_id in sorted(song_in_genres[genre])[:2]])
    return answer



def counter():
    i=0
    while True:
        yield i
        i +=1


genres=["classic", "pop", "classic", "classic", "pop"]
plays= [500, 600, 150, 800, 2500]

solution(genres, plays)