from copy import copy

# SET Practice

# 셋은 순서가 없다
# s1 = set([1,2,3])
# print(s1)
# s2 = set('hello')
# print(s2)

# 셋을 유용하게 사용하는 방법은 교집합, 합집합, 차집합을 구할때이다.
# s1 = set([1,2,3,4,5,6,7])
# s2 = set([5,6,7,8,9,10])

# print(s1&s2)
# print(s1.intersection(s2))
# print(s1 | s2)
# print(s1.union(s2))
# print(s1 - s2)
# print(s2 - s1)
# print(s1.difference(s2))
# print(s2.difference(s1))

# # add 
# s1.add(10)
# print(s1)

# update
# s1.update([8,9])
# print(s1)

#remove
# s1.remove(2)
# print(s1)

# 주소값 확인
# print(id(s1))

#[:] 을 사용하면 변수의 값을 그대로 복사한다 주솟값을 참조x
# a = [1,2,3]
# b = a
# c = a[:]
# a[1] = 4
# print(a)
# print(b)
# print(c)

# copy value change X
# a = [1,2,3]
# b = copy(a)
# a[1] = 4
# print(b)

# 변수 여러개할당 / 튜플 리스트 형태도 가능
# a,b = ('hi','hello')
# print(a)
# print(b)
# (a,b) = 'hi','hello'
# print(a)
# print(b)
# a,b = b,a # change simple
