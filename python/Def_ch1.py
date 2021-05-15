# 함수
# def add(a,b):
#     return a+b

# print(add(3,5))

# 함수의 파라미터 값이 여러개일 경우 확신할 수없을때
# def add_many(*args):
#     sum = 0
#     for i in args :
#         sum+=i
#     return sum

# print(add_many(1,2,3,4,5))

# 키워드 파라미터는 **두개붙인다.
# def print_kwargs(**kw) :
#     print(kw)
    
# print_kwargs(a=1)
# print_kwargs(b=2,name='uk')


# 결과값이 하나일 경우 튜플 형태로 나간다
# def add_mul(a,b):
#     return a+b, a*b

# print(add_mul(3,4)) # (7,12) 가들어감

# 하지만 값 두개에 할당하고 싶을땐 변수를 2개할당시킨다.
# result1, result2 = add_mul(3,4)
# print(result1)
# print(result2)

# 리턴의 다른사용
# def nick_name(name) :
#     if name == '바보' :
#         return
#     print('별명은 %s입니다.' % name)
    
# nick_name('바보')

# 매개변수에 초깃값을 미리 설정할 수있다.
# def myself(name, old, man=True) :
#     print(name)
#     print(old)
#     if man == True :
#         print('남자')
#     else :
#         print('여자')       
# myself('형우',25)

#함수 안에서 변수의 효력 범위 함수 안에서만 효력이 있다.
# a=1
# def vartest(a) :
#      a+=1

# vartest(a)
# print(a)

# # 해결방안 1 return으로 값받기 2 global 키워드 이용
# a=1
# def vartest2() :
#     # 키워드를 넣으면 함수 밖에있는 a를 사용하겟단 뜻
#     global a
#     a+=1

# print(a)
# vartest2()
# print(a)

# lambda 함수를 한줄로 간편히 포함할때 사용
# add = lambda a, b : a+b
# result = add(3,4)
# result
