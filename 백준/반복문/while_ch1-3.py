# 1
# while True :
#     A, B = map(int,input().split())
#     if A == 0 and B == 0 :
#         break
#     print(A+B)
    
# 2
# while True :
#     try :
#         A, B = map(int,input().split())
#         print(A+B)
#     except :
#         print('error')

  
# 3
# pivot = num =int(input())
# check = 0
# cnt = 0
# while True :
#     check = num//10 + num%10
#     cnt=cnt+1
#     num = int(str(num%10)+str(check%10))
#     if num == pivot :
#         break
# print(cnt)
