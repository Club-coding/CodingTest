def solution(prices):
    answer = []
    for i in range(len(prices)):
        answer.append(0)
        for j in range(i+1, len(prices)): # 떨어질때까지 더함
            if prices[i] <= prices[j]:
                answer[i] += 1
            else:  # 떨어지면 for문 탈출
                answer[i] += 1
                break
    return answer