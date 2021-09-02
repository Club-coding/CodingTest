#캐시 

LRU(캐시 교체 알고리즘 / Least Recently Used)
그냥 넣는것도 miss
캐시 크기 넘치고 list안에 없다면 miss (교체)
캐시 크기 넘치고 list안에 있다면 hit (교체)

```
def solution(cacheSize, cities):
    answer = 0
    cache = []
    if cacheSize == 0:
        return 5*len(cities)
    for city in cities:
        city = city.lower()
        if city not in cache:
            if len(cache) < cacheSize:
                answer += 5
                cache.append(city)
            else:
                answer += 5
                cache.pop(0)
                cache.append(city)
        else:
            answer += 1
            cache.pop(cache.index(city))
            cache.append(city)
            
    return answer
```