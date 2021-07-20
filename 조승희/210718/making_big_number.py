from collections import deque
def solution(number, k):
    answer = []
    number_l = deque(number)
    while k > 0:
        if len(number_l) == 0:
            break
        
        if len(answer) == 0:
            answer.append(number_l.popleft())
        else:
            if answer[-1] < number_l[0]:
                answer.pop()
                k -= 1
            else:
                answer.append(number_l.popleft())
    result = list(answer) + list(number_l)
    return ''.join(result[:len(number)-k])

# def solution(number, k):
#     answer = ''
#     max_n = int(max(number[:k+1]))
#     num_list = list(number)
#     # for i in number:
#     #     num_list.append(int(i))
#     i = 0
#     while k > 0:
#         if i == len(num_list)-1:
#             return ''.join(num_list[k:])
#         if int(num_list[i]) < max_n and i < k:
#             num_list.pop(i)
#             k -= 1
#         elif num_list[i] < num_list[i+1]:
#             num_list.pop(i)
#             k -= 1
#         else:
#             i += 1
#     answer = ''.join(num_list)
#     return answer