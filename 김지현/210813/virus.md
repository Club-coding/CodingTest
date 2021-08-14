## 바이러스

```
from collections import deque

deq = deque()
N = int(input())
couple = int(input())
dic = []
visited = [True]*N

for i in range(couple):
    m,n =map(int, input().split())
    dic.append([m,n])
#print(dic)

deq.append(1)
visited[0] = False
while(deq):
    x = deq.popleft()
    #print(x)
    for i in range(len(dic)):
        if dic[i][0] == x:
            if visited[dic[i][1]-1] == True:
                deq.append(dic[i][1])
                visited[dic[i][1]-1] = False
        
        elif dic[i][1] == x:
            if visited[dic[i][0]-1] == True:
                deq.append(dic[i][0])
                visited[dic[i][0]-1] = False
    #print(deq)

# #print(visited)
print(visited.count(False)-1)

```