# while 문도 :으로 구분하고 그 외에 다른것들은 비슷하다.
# i=0
# while i < 10 :
#     i=i+1
#     print(i,'번')

# prompt = """
# 1. Add
# 2. Del
# 3. List
# 4. Quit
# """
# """Ennter number: """
# num=0
# while num != 3 :
#     print(prompt)
#     num = int(input())
    
# 강제로 빠져나가기 break 넘어가기 continue 무한루프 True

# for문 기본구조
# test = [1,2,3,4]
# for a in test : # test의 데이터가 a로 들어감
#     print(a)

# for문 기본구조2
# test2 = [(1,2),(3,4),(5,6)]
# for (first, last) in test2 :
#     print(first + last)

# for문도 continue 사용가능함

# for문은 range 함수와 자주 사용하게 된다.
# a = range(10)
# print(a) # 0,1,2,3,4,5,6,7,8,9를 포함하는 객체를 만들어줌

# range적용
# for a in range(1,11) :
#     print(a)

# range적용2
# score = [85,95,100,70,60]
# for a in range(len(score)) :
#     if score[a] > 70 : continue
#     print(a) 

# print에 end="" 을 넣어주면 뉴라인 안함

# 리스트 내포 사용해보기
# 사용전
# a=[1,2,3,4]
# result=[]
# for num in a:
#     result.append(num*3)
# print(result)

#사용후 if 까지 추가가능
# a=[1,2,3,4]
# result=[num * 3 for num in a if num%2==0]
# print(result)

# 리스트 내포는 다양하게 사용가능
# result = [x*y for x in range(2,10)
#        for y in range(1,10)]
# print(result)
