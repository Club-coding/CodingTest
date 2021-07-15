


> ## 주식가격

    def solution(prices):
    answer = [0] * len(prices)
    for i in range(len(prices)): #단순하게 for 문 두개로 푼다
        for j in range(i+1, len(prices)):
            if prices[i] <= prices[j]:
                answer[i] += 1
            else:
                answer[i] += 1
                break
    return answer


