### 기능개발

```
import math
def solution(progresses, speeds):
    answer =[]
    s = []
    for i,j in zip(progresses, speeds):
        s.append(math.ceil((100-i)/j)) #미리 소요되는 날을 계산해서 s에 추가해줬다 예제 1번 [7,3,9] 가 들어간다
    front = 0
    for i in range(len(s)):
        if s[i] > s[front]: # i=1인 경우 s[2] > s[0] 일때 되기 때문에 answer 에는 2-0 인 2가 들어가고
            answer.append(i-front)
            front = i
    answer.append(len(s) - front) #나머지의 경우에는 2-1 = 1 이 들어간다 
    return answer

```
