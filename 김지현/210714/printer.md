### 프린터
```
def solution(priorities, location): ## 생각이 잘안나서 다시봐야할듯...
    answer = 0
    cnt =0 
    while(len(priorities)):
        if location == 0: # 위치가 가장 앞일 경우는 
            if priorities[0]< max(priorities):
                priorities.append(priorities.pop(0)) # 뺀걸 추가하고 
                location = len(priorities)-1 # location이 0이었기 때문에 길이-1 로 해준다
            else:
                return cnt+1 #마지막이기에 return 
        else:
            if priorities[0]<max(priorities):
                priorities.append(priorities.pop(0))
                location -= 1 # 실제에는 location -=1 을 생각을 못했당..
            else:
                priorities.pop(0)
                location -= 1
                cnt += 1

```
