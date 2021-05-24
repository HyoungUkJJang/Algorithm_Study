# 1
# N = int(input())
# A = list(map(int,input().split()))
# print(min(A),max(A))

# 2
# a = []
# for i in range(0,9) :
#     n = int(input())
#     a.append(n)
# print(max(a))
# print(a.index(max(a))+1)

#  3 
# i = int(input())
# j = int(input())
# b = int(input())
# a = i*j*b
# print(str(a).count('0'))
# print(str(a).count('1'))
# print(str(a).count('2'))
# print(str(a).count('3'))
# print(str(a).count('4'))
# print(str(a).count('5'))
# print(str(a).count('6'))
# print(str(a).count('7'))
# print(str(a).count('8'))
# print(str(a).count('9'))

# 4
# n = []
# for _ in(range(10)) :
#     a=int(input())
#     b = a % 42
#     n.append(b)
# s = set(n)
# print(len(s))

# 5
# n = int(input())
# s = list(map(int,input().split()))
# summ=0
# m = max(s)
# for i in range(0,len(s)) :
#      s[i] = s[i] / m * 100
#      summ += s[i]
# print(summ/n)

# 6
# n = int(input())

# for c in range(0,n) :
#     str = list(input())
#     pivot = 1
#     sum = 0
#     for i in str :
#         if i == 'O' :
#             sum = sum+pivot
#             pivot = pivot + 1
#         else :
#             pivot = 1 
#     print(sum)
    

# 7
# T = int(input())
# for i in range(0,T) :
#     jum = list(map(int,input().split()))
#     avg = sum(jum[1:])/jum[0]
#     cnt = 0
#     for j in range(1,len(jum)) :
#         if jum[j] > avg :
#             cnt = cnt +1
#     result = cnt / jum[0] * 100
#     print(f'{result:.3f}%')
    
