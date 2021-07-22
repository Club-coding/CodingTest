## 멀쩡한 사각형

```
def solution(w,h):
    answer =0
    w1 = w
    h1 = h
    while(w1 != h1): #유클리드 호제법으로 푼 것
        if w1>h1:
            w1-=h1
        else:
            h1-=w1
    return w*h-(w+h-h1) # 이 공식을 만들어지는게 너무 어려웠다
    
    
```
