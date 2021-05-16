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

# 18 - max 인수로 반복 가능한 자료형을 입력받아 최댓값을 반환
# max([10,20,15,100,70,200,80])

# 19 - min 인수로 반복 가능한 자료형을 입력받아 최솟값을 반환
# min([10,20,15,100,70,200,80])

# 20 - oct 정수 형태의 숫자를 8진수 문자열로 바꾸어 반환
# oct(34)
# oct(8)
# oct(3)
# oct(4566)

# 21 - open(filename, [mode]) 파일이름과 읽기방법을 입력받아 파일 객체를 돌려주는 함수이다. 읽기 방법을 생략하면 기본값으로 읽기전용 모드로 객체를 만들어 반환
#                             w 쓰기 r 읽기 a 추가 모드 b 바이너리 모드
# f = open('binary_file',"rb")

# 22 - ord 문자의 아스키 코드값을 돌려주는 함수 chr과 반대
# ord('A')
# ord('a')

# 23 - pow(x,y) x의 y제곲한 결과 반환
# pow(2,3)

# 24 - range(start, stop) for문과 자주 사용하는 함수로 입력받은 숫자에 해당하는 범위값을 반복가능한 객체로 만들어 반환
# list(range(1,5))
# list(range(10))
# list(range(0,10,2))

# 25 - round 숫자를 입력받아 반올림 시켜주는 함수
# round(4.3)
# round(4.5)
# round(4.6)
# round(4.4662, 2) # 둘째자리까지 반올림

# 26 - sorted 입력값을 정렬한 후 결과를 리스트로 돌려주는 함수
# sorted([4,1,2,0,6,7])
# sorted(['b','c','a'])
# sorted('zero')
# sorted((4,1,3,2,7,8,10,9))

# 27 - str 문자열 형태로 객체를 변환하여 돌려주는 함수
# str('hi')
# str(3)

# 28 - sum 입력받은 리스트나 튜플의 모든 요소의 합을 반환
# sum([1,2,3,4,5,6,7,8,9,10])
# sum((1,2,3,4,5,6,7,8,9))

# 29 - tuple 반복 가능한 자료형을 입력받아 튜플 형태로 반환 만약 튜플이 들어오면 그대로 반환
# tuple('abc')
# tuple((1,2,3,4))
# tuple([1,2,3,4,5,5])
# tuple(sorted([4,5,10,2,3,0]))

# 30 - type 입력값의 자료형이 무엇인지 알려주는 함수
# type('abc')
# type(3)
# type([])
# type(())
# type({})
# type(open('test','w'))

# 31 - zip 동일한 개수로 이루어진 자료형을 묶어주는 함수 
# list(zip([1,2,3],[4,5,6]))
# list(zip([1,2,3],[4,5,6],[7,8,9]))
# list(zip("abc","def"))

