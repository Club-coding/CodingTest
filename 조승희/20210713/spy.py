def solution(clothes):
    answer = 0
    count_dict = {}
    for i in clothes:
        if i[1] not in count_dict:
            count_dict[i[1]] = 1
        else:
            count_dict[i[1]] += 1 
    for j in count_dict.values(): # 여기까지 내가
        answer += (j + j * answer) # 이게 왜 되지
    return answer