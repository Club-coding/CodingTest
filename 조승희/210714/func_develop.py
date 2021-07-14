import math
def solution(progresses, speeds):
    answer = [0]
    day = math.ceil((100-progresses[0])/speeds[0]) # 첫번째 작업 수행일
    j = 0
    for i, p in enumerate(progresses):
        i_day = math.ceil((100-p)/speeds[i])
        if day >= i_day:
            answer[j] += 1
        else:
            day = i_day
            j += 1
            answer.append(1)
    return answer