### 기능개발

```
import math
def solution(progresses, speeds):
    answer =[]
    s = []
    for i,j in zip(progresses, speeds):
        s.append(math.ceil((100-i)/j))
    front = 0
    for i in range(len(s)):
        if s[i] > s[front]:
            answer.append(i-front)
            front = i
    answer.append(len(s) - front)
    return answer

```