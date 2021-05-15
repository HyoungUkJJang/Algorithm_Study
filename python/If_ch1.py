# 파이썬에서 if는 :(콜론) 을 붙여 구분을준다.
# a=False
# if a==True :
#     print("hello")
# else :
#     print("nohello")
    
# and or not 실습
# a = 1000
# if a >=500 or a<= 1000 :
#     print('or실습')
# if a>500 and a>=2000 :
#     print('and실습')
# else :
#    print('and거짓')
# b=True
# if not b :
#     print("true")
# else :
#     print("false")

# 조건문에서 아무행동을 하지 않고싶을 경우 pass를 쓴다.

# 파이썬에서는 in / not in기능이 있다. 튜플, 리스트, 문자열 다가능
# a=[1,2,3]
# if 1 in a :
#     print('있다')
# if 5 in a :
#     print('있다')
# else :
#     print('없다')
# if 6 not in a :
#     print('없는데 참으로 바뀜')

# elif
# a = 300
# if a>1000 :
#     print("1000보다 크다")
# elif a>=700 :
#     pass
# elif a>=500 :
#     print('500보다는 크지만 1000보다는 작다')
# else :
#     print('500이하다')

# 조건부 표현식 예제
# 기존코드
# score = 60
# if score >= 60 :
#     message='success'
# else :
#     message='fail'
# print(message)

# 조건부 표현식 적용
# score2 = 60
# message2='success' if score2 >= 70 else 'fail'
# print(message2)
