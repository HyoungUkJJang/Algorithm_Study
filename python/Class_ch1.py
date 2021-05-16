# class 실습

# 클래스 생성1
# class Calculator :
#     def __init__(self) :
#         self.result=0
        
#     def add(self, num) :
#         self.result+=num
#         return self.result

# cal1 = Calculator()
# cal2 = Calculator()
# print(cal1.add(3))


# 생성2
# class cookie :
#     pass

# cookie1 = cookie()
# cookie2 = cookie()

# 생성3 계산기
# self는 호출한 객체가 자동으로 전달된다.
# 파이썬에서 첫 번째 매개변수는 self를 명시적으로 하는게 특징이다.
# 자바에서는 첫번째 매개변수가 필요없음
# # 즉 자기자신에게 할당하기 위해 사용하는거임
# class FourCal :
#     def setData(self, first, second) :
#         self.first = first
#         self.second = second

#     def add(self) :
#         return self.first + self.second
#     def sub(self) :
#         return self.first - self.second
#     def mul(self) :
#         return self.first * self.second
#     def div(self) :
#         return self.first / self.second

    
# a = FourCal()
# type(a)
# a.setData(2,3)
# print(a.add())
# print(a.sub())
# print(a.mul())
# print(a.div())

# b = FourCal()
# type(b)
# b.setData(5,7)
# print(b.first)

# print(id(a)) # 각각 다르다는 것을 확인
# print(id(b)) #

# [생성자]
# class ConstructEx : 
#     def __init__(self, first, second) :
#         self.first = first
#         self.second = second
    

# a = ConstructEx(4,5)
# print(a.first)
# print(b.first)

# [상속]
# 상속을 하는 이유 기존 클래스를 변경하지 않고 기능을 추가하기 위해ㅔ
# class MulCal(FourCal) :
#     def mulmul(self) :
#         return self.first * self.first

# a = MulCal()
# a.setData(4,5)
# print(a.mulmul())

# [메서드오버라이딩]
# 부모 클래스에 있는 메서드를 동일한 이름으로 다시 만들어 재구성 하는것
# class methodEx(FourCal) :
#     def div(self) :
#         if self.first == 0 or self.second == 0 :
#             return 0
#         else :
#             return self.first / self.second

# # a = FourCal()
# # a.setData(4,0)
# # print(a.div())

# b = methodEx()
# b.setData(4,0)
# print(b.div())

# [클래스변수]
# class Family :
#     LastName = '김'
# a = Family()
# b = Family()
# b.LastName='박'
# print(a.LastName)
# print(b.LastName)
# print(a.LastName)
# print(Family.LastName)
# Family.LastName = '정'
# print(Family.LastName)
# print(a.LastName)
# print(b.LastName)
