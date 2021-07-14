def solution(priorities, location):
    answer = 0
    max_p = max(priorities)
    index = list(range(len(priorities)))
    while len(priorities) > 0:
        if len(priorities) == 1:
            return answer + 1
        a = priorities.pop(0)
        i = index.pop(0)
        if a == max_p:
            max_p = max(priorities)
            answer += 1
            if i == location:
                return answer
        else:
            priorities.append(a)
            index.append(i)
    return answer