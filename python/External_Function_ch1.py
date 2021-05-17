# 파이썬 외장함수

# 1 - sys 파이썬 인터프리터가 제공하는 변수와 함수를 직접 제어할 수 있게 해주는 모듈
# import sys
# print(sys.argv)

# 2 - pickle 객체의 형태를 그대로 유지하면서 파일에 저장하고 불러올 수 있게 하는 모듈
# import pickle
# f = open('test.txt','wb')
# data = {1:'python',2:'hyoung uk'}
# pickle.dump(dafa,f)
# f.close()
# data = pickle.load(f) # 그대로 딕셔너리 형태로 불러옴
# print(data)

# 3 - OS 환경 변수나 디렉터리, 파일 등 OS 자원을 제어할 수 있게 해주는 모듈
# import os
# os.evrion # 환경변수에 대한 정보를 딕셔너리 객체로 돌려줌
# os.chdir # 디렉터리 위치를 변경할 수 있음
# os.getcwd # 자신의 디렉터리 위치를 얻을 수 있음
# os.system # 기타 명령어를 파이썬에서 호출할 수도 있음
# os.popen # 명령어를 실행한 결괏값을 읽기 모두 형태의 파일 객체로 돌려줌

# 4 - shutil 파일을 복사해주는 파이썬 모듈
# import shutil
# shutil copy('src.txt','dst.txt') # src파일의 내용이 dst로 복사된다.

# 5 - glob 특정 디렉터리에 있는 파일 이름을 모두 알고 싶을때 사용
# import glob
# glob.glob('c://')

# 6 - tempfile 파일을 임시로 만들어서 사용할때 유용한 모듈
# import tempfile
# filename = tempfile.mktemp()
# filename
# f = tempfile.TemporaryFile()
# f.close() # 임시 파일은 자동으로 삭제됨

# 7 - time 시간과 관련된 모듈로 기능이 많음
# import time
# print(time.time()) # UTC를 사용하여 현재 시간을 실수 형태로 반환
# print(time.localtime()) # time.time()이 돌려준 실수 값을 이용해서 연,월,시,분,초 형태로 반환
# print(time.asctime()) # time.localtime() 이 반환된 튜플 형태의 값을 인수로 받아서 날짜와 시간을 알아보기 쉬운 형태로 반환
# print(time.ctime()) # time.asctime과 비슷해 보이지만 ctime은 항상 현재 시간만을 돌려줌
# print(time.strftime('%x',time.localtime(time.time()))) # 포맷코드를 제공하여 시간을 반환
# time.sleep(1) # 주로 루프에서 많이 사용되고 일정 시간 간격을 두고 루프를 실행할 수 있다.

# 8 - calendar 파이썬에서 달력을 볼 수 있게 해주는 모듈
# import calendar
# print(calendar.calendar(2021)) # 2021의 전체 달력
# print(calendar.prcal(2021)) # 위와 동일
# print(calendar.prmonth(2021,5)) # 특정 달만 출력
# print(calendar.weekday(2021,5,18)) # 화요일은 1 
# print(calendar.monthrange(2021,5)) # 5월은 31일까지 잇다

# 9 - random 난수를 발생시키는 모듈
# import random
# print(random.random()) # 0.0~1.9 사이의 실수 중에서 난수 값을 반환
# print(random.randint(1,10)) # 1 ~ 10 정수중에서 난수값 반환
# print(random.randint(1,100))
# def random_pop(data) :
#     #number = random.randint(0,len(data)-1)
#     number = random.choice(data) # 위보다 좀 더 직관적
#     data.remove(number)
#     return number

# if __name__ == "__main__" :
#     data=[1,2,3,4,5]
#     random.shuffle(data) # 데이터 무작위로 섞기
#     print(data)
#     while data: print(random_pop(data))

# 10 - webbrowser 자신의 시스템에서 사용하는 기본 웹 브라우저를 자동으로 실행하는 모듈
# import webbrowser 
# webbrowser.open('http://google.com')

