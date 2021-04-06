N= int(input())

def Fibo(F_1, F_2, cnt):
    F_n= F_1 + F_2
    if(cnt == 0 ):
        return F_n
    else:
        return Fibo(F_2, F_n, cnt-1)

if(N==0):
    print(0)
elif(N==1):
    print(1)
else:
    print(Fibo(0, 1, N-2))