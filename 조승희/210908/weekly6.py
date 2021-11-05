def solution(weights, head2head):
    answer = []
    result = []
    for i, head in enumerate(head2head):
        answer.append([i, 0, 0]) # index, 승리횟수, 무거운복서승리
        if head.count('N') == len(head): # n모두 N일 때는 pass
            continue
        for j in range(len(head)):
            if head[j] == 'W':
                answer[i][1] += 1
                if weights[i] < weights[j]:
                    answer[i][2] += 1
        answer[i][1] /= (len(head)-head.count('N')) # 승률계산
    answer.sort(key = lambda x : (x[1],x[2],weights[x[0]]), reverse=True)
    for a in answer:
        result.append(a[0]+1)
    return result