import heapq
def solution(scoville, K):
    answer = 0
    data = []
    for i in scoville:
        heapq.heappush(data, i)
    check = True
    while check:
        a = heapq.heappop(data)
        b = heapq.heappop(data)
        c = a + (b*2)
        heapq.heappush(data, c)#
        answer += 1
        
        for i in data:
            if i < K:
                if len(data)<=1:
                    return -1
                break
        else:
            check = False
            
    return answer
