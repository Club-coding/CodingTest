def solution(dirs):
    answer = 0
    visited = []
    start = (0, 0)
    for d in dirs:
        if d == "U":
            if start[1] == 5: # 경계 넘을 때
                continue
            end = (start[0], start[1]+1) # 도착점
        elif d == "D":
            if start[1] == -5:
                continue
            end = (start[0], start[1]-1)
        elif d == "R":
            if start[0] == 5:
                continue
            end = (start[0]+1, start[1])
        else:
            if start[0] == -5:
                continue
            end = (start[0]-1, start[1])
        a = [start,end] # 시작점+도착점
        if set(a) not in visited: #방향성 없애기 위해 set으로
            answer += 1
            visited.append(set(a))
        start = end
    
    return answer