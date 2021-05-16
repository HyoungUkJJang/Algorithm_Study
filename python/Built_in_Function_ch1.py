# 파이썬 내장 함수에 대하여

# 1 - abs 절댓값을 돌려주는 함수
# print(abs(-3))

# 2 - all 반복 가능한 자료형 x를 입력 인수로 받으며 모두 참이면 true 거짓이 하나라도 있으면 false를 반환
# all([5,4,3,2,1])
# all([5,4,3,2,1,0])

# 3 - any x중 하나라도 참이 있으면 true 모두 거짓일때만 false
# all의 반대
# any([1,2,3,4])
# any([0,1,2,3])
# any([0,0,0])

# 4 - chr 아스키 코드 값을 입력받아 그 코드에 해당하는 문자 반환
# print(chr(65))
# print(chr(97))

# 5 - dir 객체가 자체적으로 가지고 있는 변수나 함수를 보여줌
# dir([1,2,3])
# dir((1,2,3))
# dir({1:'gg'})

# 6 - divmod 2개의 숫자를 입력받고 a를 b로 나눈 몫과 나머지를 튜플 형태로 반환
# print(divmod(13,3))

# 7 - enumerate 열겨하다 뜻으로 순서가 있는 자료형을 입력받아 인덱스 값을 포함하는 enumerate 객체를 돌려줌
# for i, name in enumerate(['body','foo','bar']) :
#     print(i,name)

# 8 - eval 실행 가능한 문자열을 입력으로 받아 문자열을 실행한 결괏값을 돌려주는 함수
# eval('1+2')
# eval("'hi'+'hello'")

# 9 - filter 첫번째 인수로 함수 이름 두번째 인수로 그 함수에 차례로 들어갈 반복 가능한 자료형을 받는다.
#            두번째 인수인 반복 가능한 자료형 요소가 첫 번째 인수인 함수에 입력되었을때 반환 값이 참인것만 묶어서 돌려줌
# def positive(l):
#     result=[]
#     for i in l:
#         if i > 0 :
#             result.append(i)
#     return result
    
# print(positive([4,-3,2,0,-5,6]))

# 10 - hex 정수 값을 입력 받아 16진수로 변환
# hex(234)
# hex(3)

# 11 - id 객체를 입력받아 객체의 고유 주소값을 돌려주는 함수
# ins = 123
# id(ins)
# ins2 = 456
# id(ins2)

# 12 - input 사용자 입력을 받는 함수 
# a = input("input - enter : ")

# 13 - int 문자열 형태의 숫자나 소수점이 있는 숫자를 정수 형태로 돌려주는 함수
# int('3')
# int(4.9)
# int('11',2) # 2진수로 되어있을 경우
# int('FF',16) # 16진수로 되잇을경우

# 14 - isinstance 첫번째 인수로 인스턴스, 두번째 인수로 클래스 이름을 받는다.
#                 입력으로 받은 인스턴스가 그 클래스의 인스턴스 인지를 판단해서 참이면 트루 거짓이면 펄스 반환
# class Person : 
#     pass
# a = Person()
# b = 2
# print(isinstance(a,Person))
# print(isinstance(b,Person))

# 15 - len 입력값의 길이를 반환
# str = 'python11'
# len(str)

# 16 - list 반복 가능한 자료형 s를 입력받아 리스트로 돌려줌
# list('python')
# list((1,2,3,4,5))

# 17 - map 함수와 반복 가능한 자료형을 입력으로 받는다 맵은 입력 받은 자료형의 각 요소를 첫번째 인수가 수행한 결과를 묶어서 돌려줌
# 적용전
# def two_times(numberList) :
#     result = []
#     for number in numberList :
#         result.append(number*2)
#     return result

# result = two_times([1,2,3,4,5])
# print(result)

# 적용후
# def two_times2(x) : return x*2
# list(map(two_times2,[1,2,3,4,5]))
