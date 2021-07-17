
## 더 맵게

```{.python}
import heapq

#HEAPQ를 써야 통과가 되는거였던것이당 !

def solution(scoville, K):
    heapq.heapify(scoville)
    cnt = 0
    while(len(scoville)>=2):
        if scoville[0] > K:
            return cnt
        heapq.heappush(scoville, heapq.heappop(scoville) + heapq.heappop(scoville) * 2) #여기에서 효율성이 차이난듯
        cnt +=1
    
    if scoville[0] < K:
        return -1

    return cnt

```

처음 풀었던것 .. 효율성 전부 시간 초과.. 
```{.python}
def solution(scoville, K):
     heapq.heapify(scoville)
    
    cnt = 0
    print(scoville)
    while(len(scoville)>=2):
        print(scoville)
        if scoville[0] > K:
            return cnt
        if len(scoville) == 2:
            scoville.append(scoville.pop(0) + (scoville.pop(0)*2))
        else:
            scoville[0] = scoville.pop(0) + (scoville.pop(0)*2)
        cnt +=1
        heapq.heapify(scoville)
    
    if scoville[0] < K:
        return -1

    return cnt
    
    
scoville = [1,30,5,69,2,4,6]	
K = 80
print(solution(scoville, K))

```
