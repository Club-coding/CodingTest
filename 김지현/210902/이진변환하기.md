# 이진 변환 반복 하기

-----------------------

```
def solution(s):
    cnt = 1
    num =0
    if len(s) == 1:
        return [0, num]
    while(len(s)>1):
        num += s.count('0')
        s = s.replace("0","")
        if len(s) == 1:
            return [cnt, num]
        s = str(bin(len(s)))[2:]
        cnt += 1
    return [cnt, num]
```