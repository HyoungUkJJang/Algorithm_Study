[String 클래스 함수정리]

charAt(index) > 인덱스에 잇는 문자 반환

toUpperCase(), toLowerCase() > 대,소문자로 변환시킴

toCharArray() > 문자열을 char 원소 상태인 배열로 리턴해줌

replaceAll("[^A-Z]","") > 대문자를 제외한 것들은 지워준다. 그외에 정규식을 이용하여 원하는 형태로 만들 수 있다.

new StringBuilder(str) 객체는 문자열을 뒤집을때 유용하다 > reverse() 

if(str.equalsIgnoreCase(tmp)) > 문자열 검사할때 대소문자를 무시하고 검사한다.

[Charector 정리]

Character.toUpperCase() or toLowerCase() > 대소문자 변환

Character.isUpperCase() or isLowerCase() > 대문자인지 소문자인지 검사

Character.isAlphabetic() > 해당 문자가 알파벳인지 확인

