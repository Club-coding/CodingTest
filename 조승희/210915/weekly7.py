def solution(enter, leave):
    answer = [0]*len(enter)
    room = []
    cnt = 0
    for i in range(len(enter)):
        for r in room:
            answer[r-1] += 1
        answer[enter[i]-1] += len(room)
        room.append(enter[i])
        while cnt<len(leave) and leave[cnt] in room:
            room.remove(leave[cnt])
            cnt += 1
    return answer